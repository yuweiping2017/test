package com.howtodoinjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
public class UserDataList {
	public String stt;
	public String status;
	public String statusText;
	public String getStt() {
		return stt;
	}
	public void setStt(String stt) {
		this.stt = stt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

}
