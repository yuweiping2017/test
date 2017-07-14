package com.howtodoinjava.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="stream")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class QueryFransferRespBody {

	private String status;
	private String statusText;
	private List<UserDataList> userDataList;
	
  @XmlElementWrapper(name = "list")
  @XmlElement(name = "row")
	public List<UserDataList> getUserDataList() {
		return userDataList;
	}

	public void setUserDataList(List<UserDataList> userDataList) {
		this.userDataList = userDataList;
	}

	@XmlElement
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement
	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}


	
	public QueryFransferRespBody(){
		
	}
	
	
}
