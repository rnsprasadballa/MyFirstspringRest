package com.prasad.spring.restful.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERACCOUNT")
public class UserAccount
{
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ACCOUNTID", nullable=false)
	private Integer accountId;
	
	@Column(name="FIRSTNAME", length=64, nullable=true)
	private String firstName;
	
	@Column(name="LASTNAME", length=64, nullable=true)
	private String lastName;
	
	@Column(name="EMAILID", length=128, nullable=true)
	private String email;
	
	@Column(name="COMPANYNAME", length=64, nullable=true)
	private String companyName;
	
	@Column(name="COUNTRY", length=20, nullable=true)
	private String country;
	
	@Column(name="USERID", length=128, nullable=true)
	private String userName;
	
	@Column(name="PASSWORD", length=16, nullable=true)
	private String password;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
