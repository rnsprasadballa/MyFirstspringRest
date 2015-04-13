/**
 * 
 */
package com.prasad.spring.restful.persistence.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prasad.spring.restful.persistence.entity.UserAccount;

/**
 * @author user
 *
 */
public class UserAccountHibernateDao implements UserAccountDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserAccountHibernateDao.class);
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public UserAccount saveUserAccountInformation(UserAccount useraccount)
	{
		UserAccount user = null;
		try
		{
			Session session = getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			user = (UserAccount) session.save(useraccount);
			tx.commit();
			session.close();
		}
		catch(Exception ex)
		{
			LOGGER.error("Error in saving user data");
		}
		return user;
	}

}
