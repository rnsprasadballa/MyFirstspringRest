package com.prasad.spring.restful.persistence.dao;

import com.prasad.spring.restful.model.Status;
import com.prasad.spring.restful.persistence.entity.UserAccount;

public interface UserAccountDao
{
	Status saveUserAccountInformation(final UserAccount useraccount);
}
