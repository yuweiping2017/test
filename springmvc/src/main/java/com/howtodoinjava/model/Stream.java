package com.howtodoinjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "stream")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stream {

	public String action;
	public String userName;
	public String accountNo;
	public String subAccNo;
	
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getSubAccNo() {
		return subAccNo;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}
	
	
}
