package com.howtodoinjava.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MockServerController {
	
	
	/*
	 * 商户接受请求Mock,返回成功的code=1
	 */
	@RequestMapping("/mockServer")
	@ResponseBody
	public Object mockServer(HttpServletRequest request){
	    Map map = new HashMap();  
        Enumeration paramNames = request.getParameterNames();  
       while (paramNames.hasMoreElements()) {  
         String paramName = (String) paramNames.nextElement();
         String[] paramValues = request.getParameterValues(paramName);  
         if (paramValues.length == 1) {  
           String paramValue = paramValues[0];
           if (paramValue.length() != 0) {
             map.put(paramName, paramValue);  
           }  
         }  
       }
       JSONObject jo = JSONObject.fromObject(map);
      // System.out.println("输入参数为:" + jo.toString());
//       Map<String, Object> resultMap = new HashMap<String, Object>();
       JSONObject json = new JSONObject();
		   json.put("code", "1");
		   json.put("message", "successful");
		   json.put("data", map);
       System.out.println("返回数据为:" + json.toString());
       return json;
	}
	
	/*
	 * 商户接受请求Mock,返回失败的code=1
	 */
	@RequestMapping("/mockServerFailed")
	@ResponseBody
	public Object mockServerFailed(HttpServletRequest request){
	    Map map = new HashMap();  
        Enumeration paramNames = request.getParameterNames();  
       while (paramNames.hasMoreElements()) {  
         String paramName = (String) paramNames.nextElement();
         String[] paramValues = request.getParameterValues(paramName);  
         if (paramValues.length == 1) {  
           String paramValue = paramValues[0];
           if (paramValue.length() != 0) {
             map.put(paramName, paramValue);  
           }  
         }  
       }
       JSONObject jo = JSONObject.fromObject(map);
       System.out.println("输入参数为:" + jo.toString());
//       Map<String, Object> resultMap = new HashMap<String, Object>();
       JSONObject json = new JSONObject();
		   json.put("code", "2");
		   json.put("message", "failed");
		   json.put("data", map);
       System.out.println("返回数据为:" + json.toString());
       return json;
	}
	

}
