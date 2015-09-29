package com.prasad.spring.restful.business;

import com.prasad.spring.restful.persistence.entity.UserAccount;

public interface UserAccountBusiness
{
	UserAccount saveUserAccountDetails(final UserAccount userAccount);

}
