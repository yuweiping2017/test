package com.howtodoinjava.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;




public class XmlAPojoUtils {
	
	private static final String  FILEPATH = "D:/billfile/record.txt";
	
	 public static <T> T xmlToPojo(Class c, InputStream is) throws JAXBException {
			JAXBContext context;
			context = JAXBContext.newInstance(c);
			Unmarshaller unmarshal = context.createUnmarshaller();
			T obj = (T) unmarshal.unmarshal(is);
			return obj;
		}
	 
	 public  static <T> T xmlToPojo(Class c, String xml) throws JAXBException {
			JAXBContext context;
			context = JAXBContext.newInstance(c);
			Unmarshaller unmarshal = context.createUnmarshaller();
			T obj = (T) unmarshal.unmarshal(new StringReader(xml));
			return obj;
	 
		}
	 
	 public static String pojoToXml(Class c) throws JAXBException{
		 JAXBContext context = JAXBContext.newInstance(c.getClass());
      Marshaller m = context.createMarshaller();
      StringWriter sw = new StringWriter();
      m.marshal(c,sw);
      return sw.toString();
	 }
	 
	 public static void writeString(String message) {
		 //2.写入过程
//		 String inputmessage = message + "1111  \n ";
			try {
				FileWriter fw = new FileWriter(FILEPATH, true);
				 BufferedWriter bw = new BufferedWriter(fw);  
			        //把要写入的字符串都按照要写入文件的编码方式生成，再写入  
			        String str2 = new String(message.getBytes("utf8"), "utf8");  
			        System.out.println(str2);  
			        bw.write("\r\n");
			        bw.write(str2);			        
			        bw.flush();  
			        bw.close();  
			        fw.close();  
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	       
		}
	 
	 public static String readOneString(String clientId) {
		 String amount = null;
		//1.读取过程  
			try {
				InputStream is = new FileInputStream(FILEPATH);
				  InputStreamReader isr = new InputStreamReader(is, "utf8");//文件什么编码方式存的，就用什么编码方式读取  
			        BufferedReader br = new BufferedReader(isr);  
			        String str1 = null;  
			        while((str1 = br.readLine()) != null) {
			        	if(str1.contains(clientId)){
			        		String[] str2 =  str1.split("\\|");
			        		amount = str2[str2.length-1];
			        		 return amount;
			        	}
			        }  
			        br.close();  
			        isr.close();  
			        is.close();  
			       
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	      
			return amount;
		}

	 public static void main(String[] args) {
		String str = "clientd|12312312|amount|12312|";
		String[] str1 = str.split("\\|");
		System.out.println(str1[str1.length-1]);
	}
}
