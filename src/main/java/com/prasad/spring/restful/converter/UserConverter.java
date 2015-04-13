package com.prasad.spring.restful.converter;

import com.prasad.spring.restful.model.UserData;
import com.prasad.spring.restful.persistence.entity.UserAccount;

public final class UserConverter
{
	public static final UserAccount convertUserData(final UserData userData)
	{
		UserAccount userAcc = new UserAccount();
		userAcc.setAccountId(userData.getUserAccountId());
		userAcc.setCompanyName(userData.getCompanyName());
		userAcc.setCountry(userData.getCountry());
		userAcc.setEmail(userData.getEmail());
		userAcc.setFirstName(userData.getFirstName());
		userAcc.setLastName(userData.getLastName());
		userAcc.setPassword(userData.getPassword());
		userAcc.setUserName(userData.getUserId());
		return userAcc;
	}

	public static final UserData convertUserAccount(final UserAccount userAccount)
	{
		UserData userdata = new UserData();
		userdata.setUserAccountId(userAccount.getAccountId());
		userdata.setCompanyName(userAccount.getCompanyName());
		userdata.setCountry(userAccount.getCountry());
		userdata.setEmail(userAccount.getEmail());
		userdata.setFirstName(userAccount.getFirstName());
		userdata.setLastName(userAccount.getLastName());
		userdata.setPassword(userAccount.getPassword());
		userdata.setUserId(userAccount.getUserName());
		return userdata;
	}
}
