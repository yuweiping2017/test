package com.howtodoinjava.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Service;

import com.howtodoinjava.model.CommonRespBody;
import com.howtodoinjava.model.QueryFransferRespBody;
import com.howtodoinjava.model.RequestForQueryTransfer;
import com.howtodoinjava.model.RequestForTransfer;
import com.howtodoinjava.model.UserDataList;
import com.howtodoinjava.utils.XmlAPojoUtils;

@Service
public class DealRequestServiceImpl implements DealRequestService{



	public Object proce(String request) {
		// TODO Auto-generated method stub
		if(request.isEmpty() || request.equals("")){
			System.out.println("请求参数为空");
			return null;
		}else if (request.contains("<action>DLSUBTRN</action>") || request.contains("<action>DLMDETRN</action>")){
			//匹配是转账或者是强制转账时
			//将请求转对象
			try {
				RequestForTransfer transfer = (RequestForTransfer)XmlAPojoUtils.xmlToPojo(RequestForTransfer.class, request);
				if (transfer.getTranAmt().equals("11.00") || transfer.getTranAmt().equals("22.00") 
						|| transfer.getTranAmt().equals("33.00") || transfer.getTranAmt().equals("44.00") || transfer.getTranAmt().equals("55.00")){
					XmlAPojoUtils.writeString("clientId|" +transfer.getClientID() + "|amount|" + transfer.getTranAmt() + "|" );
				}				
				CommonRespBody respon = new CommonRespBody();
	        	respon.setStatus("AAAAAAE");
	        	respon.setStatusText("submit success");
	        	return respon;
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(request.contains("<action>DLCIDSTT</action>")){
			//转账查询接口
			//将请求转为对象
			try {
				RequestForQueryTransfer queryfransfer = (RequestForQueryTransfer)XmlAPojoUtils.xmlToPojo(RequestForQueryTransfer.class, request);
				String amount = XmlAPojoUtils.readOneString(queryfransfer.getClientID());
				QueryFransferRespBody respbody = new QueryFransferRespBody(); 
				respbody.setStatus("AAAAAAE");
				respbody.setStatusText("转账成功");
				UserDataList userlist = new UserDataList();
				List<UserDataList> list = new ArrayList<UserDataList>();
				if(amount==null ||"".equals(amount)){
					userlist.setStatus("0");
					userlist.setStatusText("用户转账成功");
					userlist.setStt("0");
					list.add(userlist);
					respbody.setUserDataList(list);
					return respbody;
				}else if(amount.equals("11.00")){
					userlist.setStatus("0");
					userlist.setStt("1");
					userlist.setStatusText("failed");
					list.add(userlist);
					respbody.setUserDataList(list);
					return respbody;
				}else if (amount.equals("22.00")){
					userlist.setStatus("0");
					userlist.setStt("2");
					userlist.setStatusText("unknow");
					list.add(userlist);
					respbody.setUserDataList(list);
					return respbody;
				}else if (amount.equals("33.00")){
					userlist.setStatus("0");
					userlist.setStt("3");
					userlist.setStatusText("reject");
					list.add(userlist);
					respbody.setUserDataList(list);
					return respbody;
				}else if (amount.equals("44.00")){
					userlist.setStatus("0");
					userlist.setStt("4");
					userlist.setStatusText("rowback");
					list.add(userlist);
					respbody.setUserDataList(list);
					return respbody;
				}else if (amount.equals("55.00")){
					userlist.setStatus("0");
					userlist.setStt("");
					userlist.setStatusText("stt empty");
					list.add(userlist);
					respbody.setUserDataList(list);
					return respbody;
				}else{
				userlist.setStatus("0");
				userlist.setStatusText("用户转账成功");
				userlist.setStt("0");
				list.add(userlist);
				respbody.setUserDataList(list);
				return respbody;
				}
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
