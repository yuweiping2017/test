package com.howtodoinjava.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.howtodoinjava.model.CommonRespBody;
import com.howtodoinjava.model.QueryFransferRespBody;
import com.howtodoinjava.model.Stream;
import com.howtodoinjava.model.RespBody;
import com.howtodoinjava.model.UserDataList;
import com.howtodoinjava.service.DealRequestServiceImpl;
import com.howtodoinjava.utils.XmlAPojoUtils;
import com.thoughtworks.xstream.XStream;



@Controller
public class ChannelMockServerController {
	
	@Autowired
	private DealRequestServiceImpl dealRequestServiceImpl;
	
	 @RequestMapping("/xml0")
	 @ResponseBody
	public Object getChannelReq(HttpServletRequest request) throws IOException, JAXBException{
		System.out.println("start in xml......");
		//request.setCharacterEncoding("UTF-8");
       int size = request.getContentLength();
        InputStream is = request.getInputStream();
        byte[] reqBodyBytes = readBytes(is, size);
        String res = new String(reqBodyBytes);
        if(res.contains("DLBREGSN")){
        	RespBody respbody = new RespBody();
        	respbody.setStatus("0");
        	return respbody;
        }
        if(res.contains("<action>DLSUBTRN</action>") || res.contains("<action>DLMDETRN</action>") || res.contains("<action>DLTRSFIN</action>")){
//        	String respon = "<?xml version=\"1.0\" encoding=\"utf-8\"?> " +
//"<stream>" + 
//		"<status>AAAAAAE</status>" +
//		"<statusText>已提交银行处理，需稍后使用查询接口</statusText>" +
//"</stream>";
//        	System.out.println("响应消息为");
//        	System.out.println(respon);
        	CommonRespBody respon = new CommonRespBody();
        	respon.setStatus("AAAAAAE");
        	respon.setStatusText("sumbit success,check later");
        	return respon;
        }
        
        if(res.contains("<action>DLCIDSTT</action>")){
        	System.out.println("response dlcidstt");
        	QueryFransferRespBody respbody = new QueryFransferRespBody(); 
        	respbody.setStatus("AAAAAAE");
        	respbody.setStatusText("转账成功");
        	UserDataList userlist = new UserDataList();
        	List<UserDataList> list = new ArrayList<UserDataList>();
        	userlist.setStatus("0");
        	userlist.setStatusText("用户转账成功");
        	userlist.setStt("0");
        	list.add(userlist);
        	respbody.setUserDataList(list);
        	return respbody;
        }
        System.err.println("请求报文：");
        System.out.println(res);
		Stream transfer =XmlAPojoUtils.xmlToPojo(Stream.class, res);
		System.err.println(transfer.getAccountNo());
		return transfer;
		
	}

	 public static final byte[] readBytes(InputStream is, int contentLen) {
         if (contentLen > 0) {
                 int readLen = 0;
                 int readLengthThisTime = 0;
                 byte[] message = new byte[contentLen];
                 try {
                         while (readLen != contentLen) {
                                 readLengthThisTime = is.read(message, readLen, contentLen
                                                 - readLen);
                                 if (readLengthThisTime == -1) {// Should not happen.
                                         break;
                                 }
                                 readLen += readLengthThisTime;
                         }
                         return message;
                 } catch (IOException e) {
                         // Ignore
                         // e.printStackTrace();
                 }
         }

         return new byte[] {};
 }

	 @RequestMapping("/xml")
	 @ResponseBody
	public Object proceReq(HttpServletRequest request) throws IOException{
		System.out.println("start in xml......");
		//request.setCharacterEncoding("UTF-8");
       int size = request.getContentLength();
        InputStream is = request.getInputStream();
        byte[] reqBodyBytes = readBytes(is, size);
        String res = new String(reqBodyBytes);
        return dealRequestServiceImpl.proce(res);
	 }
	 
	 public static void main(String[] args) throws JAXBException {
		
//		 System.out.println("==================");
//		 JAXBContext jc = JAXBContext.newInstance(QueryFransferRespBody.class);  
//     	QueryFransferRespBody respbody = new QueryFransferRespBody(); 
//     	respbody.setStatus("AAAAAAE");
//     	respbody.setStatusText("转账成功");
//     	UserDataList userlist = new UserDataList();
//     	List<UserDataList> list = new ArrayList<UserDataList>();
//     	userlist.setStatus("0");
//     	userlist.setStatusText("用户转账成功");
//     	userlist.setStt("0");
//     	list.add(userlist);
//     	respbody.setUserDataList(list);
//     	Marshaller marshaller = jc.createMarshaller();
//     	 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
//         marshaller.marshal(respbody, System.out);  

//         System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
//         XStream xstream = new XStream();
//         ResponTTTTT resptttt = new ResponTTTTT();
//         resptttt.setStatus("22222");
//         resptttt.setStatusText("xxxxxxxxx");
//         UserDataListTTT userDataList = new UserDataListTTT();
//         userDataList.setName("yyy");
//         List<QueryRowTTT> row = new ArrayList<QueryRowTTT>();
//         QueryRowTTT querytttt = new QueryRowTTT();
//         querytttt.setStatus("3333");
//         querytttt.setStatusText("sdsdsdsd");
//         querytttt.setStt("444444");
//         row.add(querytttt);
//         userDataList.setRow(row);
//         resptttt.setUserDataListTTT(userDataList);
//         String xml = xstream.toXML(resptttt);
//         System.out.println(xml);
//         JAXBContext context = JAXBContext.newInstance(respbody.getClass());
//         Marshaller m = context.createMarshaller();
//         StringWriter sw = new StringWriter();
//         m.marshal(respbody,sw);
//         System.out.println(sw.toString());
//         System.out.println("===================");
//         String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
//"<stream>" +
//    "<status>AAAAAAE</status>" +
//    "<statusText>转账成功</statusText>" +
//    "<list name=\"userDataList\">" +
//        "<row>" + 
//           " <stt>0</stt>" +
//            "<status>0</status>" +
//            "<statusText>用户转账成功</statusText>" +
//        "</row>" +
//    "</list>" +
//"</stream>";
//         System.out.println(xml);
//         XStream xstream = new XStream();
//         ResponTTTTT resptttt = (ResponTTTTT)xstream.fromXML(xml);
//        System.out.println(resptttt.getStatus());
	}
}
