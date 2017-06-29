package com.free.designpatterns.responsibilitychain.common;


/**
 * 古代女性的总称 
 * @author Free
 *
 */
public class WomenImpl implements Women{

	/*   
	 * 通过一个int类型的参数来描述妇女的个人状况   
	 * 1---未出嫁   
	 * 2---出嫁   
	 * 3---夫死  
	 */  
	private int type=0;      
	
	//妇女的请示  
	private String request = ""; 
	
	
	public WomenImpl(int type, String request){
		this.type = type;
		this.request = request;
	}

	public int getType(){
		return this.type;
	}

	public String getRequest(){
		return this.request;
	}

}
