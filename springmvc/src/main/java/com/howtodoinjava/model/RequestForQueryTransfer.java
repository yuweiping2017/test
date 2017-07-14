package com.howtodoinjava.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "stream")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestForQueryTransfer  implements Serializable{
	
	public String action;
	public String userName;
	public String clientID;
	public String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	

}
