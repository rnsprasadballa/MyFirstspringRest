package com.prasad.spring.restful.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.prasad.spring.restful.persistence.dao.UserAccountDao;
import com.prasad.spring.restful.persistence.entity.UserAccount;

@Component
public class DefaultUserAccountBusiness implements UserAccountBusiness
{
	@Autowired
	private UserAccountDao userAccountDao;

	public UserAccount saveUserAccountDetails(UserAccount userAccount) {
		return getUserAccountDao().saveUserAccountInformation(userAccount);
	}

	public UserAccountDao getUserAccountDao() {
		return userAccountDao;
	}

	public void setUserAccountDao(UserAccountDao userAccountDao) {
		this.userAccountDao = userAccountDao;
	}

}
