package com.howtodoinjava.model;

public class PayResult {
	
	public String amount;
	public String extendParams;
	public String outTradeNo;
	public String signature;
	public String timestamp;
	public String tradeNo;
	public String tradeStatus;
	public String bankCode;
	public String status;
	public String appId;
	public String outCustomerId;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getOutCustomerId() {
		return outCustomerId;
	}
	public void setOutCustomerId(String outCustomerId) {
		this.outCustomerId = outCustomerId;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	public String bankName;
	public String bankAccount;
	public String customerMobile;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getExtendParams() {
		return extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}
	public String getOutTradeNo() {
		return outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeStatus() {
		return tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}


}
