package com.prasad.spring.restful.persistence.dao;

import com.prasad.spring.restful.persistence.entity.UserAccount;

public interface UserAccountDao
{
	UserAccount saveUserAccountInformation(final UserAccount useraccount);
}
