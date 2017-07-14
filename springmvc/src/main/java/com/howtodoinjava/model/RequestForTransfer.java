package com.howtodoinjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="stream")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestForTransfer {

	public String action;
	public String userName;
	public String clientID;
	public String accountNo;
	public String payAccNo;
	public String tranType;
	public String recvAccNo;
	public String recvAccNm;
	public String tranAmt;
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
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getPayAccNo() {
		return payAccNo;
	}
	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public String getRecvAccNo() {
		return recvAccNo;
	}
	public void setRecvAccNo(String recvAccNo) {
		this.recvAccNo = recvAccNo;
	}
	public String getRecvAccNm() {
		return recvAccNm;
	}
	public void setRecvAccNm(String recvAccNm) {
		this.recvAccNm = recvAccNm;
	}
	public String getTranAmt() {
		return tranAmt;
	}
	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}
	
	
	
}
