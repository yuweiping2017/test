package com.howtodoinjava.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;








import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.howtodoinjava.mapper.YuserVO;
import com.howtodoinjava.model.BandCardResult;
import com.howtodoinjava.model.EmployeeVO;
import com.howtodoinjava.model.PayResult;
import com.howtodoinjava.model.ResultReedom;
import com.howtodoinjava.model.User;
import com.howtodoinjava.service.YuserServiceImpl;
import com.howtodoinjava.zkserver.TestRegistryServiceImpl;


@Controller
@RequestMapping("/mvc")
public class EmployeeController {

	@Autowired
	private YuserServiceImpl yuserServiceImpl;
	
	@RequestMapping("/aa")
	public ModelAndView getHello(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("test", "aaaaaaaaaaaaaaaaa");
		mv.setViewName("test");
		return mv;			
	}
	
	   @ResponseBody
	    @RequestMapping(value="/user")
	    public  List<User> get(@ModelAttribute("user") User u){
		   System.out.println("id=====" + u.getId());
		   List<User> list = new ArrayList<User>();
		   ApplicationContext ctx =  new ClassPathXmlApplicationContext("beans/beans.xml");
	        User u1 = (User)ctx.getBean("user");
	        u1.setId(u.getId());
	        u1.setName(u.getName());
	        u1.setBirthdata(u.getBirthdata());
	        list.add(u1);
	        User u2 = (User)ctx.getBean("user");
	        u2.setId(u.getId());
	        u2.setName(u.getName());
	        u2.setBirthdata(u.getBirthdata());
	        list.add(u2);
	        JSONArray ll = JSONArray.fromObject(list);
			System.out.println(ll);
//	        list.add(u2);
	        return list;
	    }
	   
	   @ResponseBody
	    @RequestMapping(value="/result")
	    public  List<ResultReedom> get(@ModelAttribute("resultReedom") ResultReedom rd){
		   System.out.println("OutCustomerId=========" + rd.getOutCustomerId());
		   JSONObject jsonStu = JSONObject.fromObject(rd);  
		   System.out.println(jsonStu.toString());
		   List<ResultReedom> list = new ArrayList<ResultReedom>();
		   ApplicationContext ctx =  new ClassPathXmlApplicationContext("beans/beans.xml");
		   ResultReedom rr = (ResultReedom)ctx.getBean("resultReedom");	
		   rr.setOutCustomerId(rd.getOutCustomerId());
	        list.add(rr);
	        return list;
	    }
	   @ResponseBody
	   @RequestMapping("/payresult")
	   public Object payResult(@ModelAttribute("payResult") PayResult pr){
		   JSONObject payresult = JSONObject.fromObject(pr);
		   System.out.println(payresult.toString());
		   Map<String, Object> resultMap = new HashMap<String, Object>();
           //resultMap.put(, result);
           JSONObject json = new JSONObject();
   		   json.put("code", "1");
   		   json.put("message", "successful1111111111111111111111111111");
   		   json.put("data", resultMap);
           System.out.println(json.toString());;;;;          
           return json;
//           return json.toString();
	   }
	   
	   @ResponseBody
	   @RequestMapping("/proxyresult")
	   public PayResult proxyResult(@ModelAttribute("payResult") PayResult pr){
		   JSONObject payresult = JSONObject.fromObject(pr);
		   System.out.println(payresult.toString());
		   return pr;
	   }
	   
	   @ResponseBody
	   @RequestMapping("/bandCardResult")
	   public BandCardResult bandCardResult(@ModelAttribute("bandCardResult") BandCardResult bcr){
		   JSONObject bandCardResult = JSONObject.fromObject(bcr);
		   System.out.println(bandCardResult.toString());
		   return bcr;
	   }
	   
	   @ResponseBody
	   @RequestMapping("/getYuserVo")
	   public YuserVO getYuserVo(){
		  YuserVO yvo = yuserServiceImpl.getUserByName("yu1");
		   System.out.println(yvo.getUser_emial());
		   System.out.println(yvo.getUser_Password());
		   return yvo;
	   }
}

