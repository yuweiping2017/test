package com.howtodoinjava.test;


public class MessageUtil {
	
	private String message;

	   //Constructor
	   //@param message to be printed
	   public MessageUtil(String message){
	      this.message = message;
	   }

	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   

	   public static void main(String[] args) {
		String msg = String.format("--------{1}----{2}", "a","b");
		System.err.println(msg);
	}
}
