package com.free.designpatterns.responsibilitychain.common;


/**
 * 丈夫类 
 * @author Free
 *
 */
public class Husband implements Handler{

	//妻子向丈夫请示  
	public void HandleMessage(Women women) {   
		System.out.println("妻子的请示是："+women.getRequest());   
		System.out.println("丈夫的答复是：同意");  
	}


}
