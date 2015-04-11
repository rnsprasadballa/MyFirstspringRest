/**
 * 
 */
package com.prasad.spring.restful.persistence.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prasad.spring.restful.model.Status;
import com.prasad.spring.restful.persistence.entity.UserAccount;

/**
 * @author user
 *
 */
public class UserAccountHibernateDao implements UserAccountDao
{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Status saveUserAccountInformation(UserAccount useraccount)
	{
		try
		{
			Session session = getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(useraccount);
			tx.commit();
			session.close();
		}
		catch(Exception ex)
		{
			return Status.DATA_ERROR;
		}
		return Status.SUCCESS;
	}

}
