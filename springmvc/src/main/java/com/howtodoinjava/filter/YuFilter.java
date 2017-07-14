package com.howtodoinjava.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class YuFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        Enumeration paramNames = request.getParameterNames();  
       while (paramNames.hasMoreElements()) {  
         String paramName = (String) paramNames.nextElement();
         if (paramName.contains("error")){
        	 System.out.println("sssssssssssssssssssss");
        	 PrintWriter out = response.getWriter();
        	 out.print("error");
        	 
         }else{
        	 chain.doFilter(request, response);
         }
        
       }
		
	}

}
