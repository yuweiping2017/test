package com.howtodoinjava.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="stream")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespBody {

	public String status;
	public String statusText;
	public String subAccNo;
	public String subAccNm;
	public String hostNo;
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

	public String getSubAccNo() {
		return subAccNo;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}

	public String getSubAccNm() {
		return subAccNm;
	}

	public void setSubAccNm(String subAccNm) {
		this.subAccNm = subAccNm;
	}

	public String getHostNo() {
		return hostNo;
	}

	public void setHostNo(String hostNo) {
		this.hostNo = hostNo;
	}


	
	public RespBody(){
		
	}
	
	
}
