package com.free.designpatterns.responsibilitychain.common;


/**
 * 父亲 
 * @author Free
 *
 */
public class Father implements Handler{

	//未出嫁女儿来请示父亲  
	public void HandleMessage(Women women) {   
		System.out.println("女儿的请示是："+women.getRequest());   
		System.out.println("父亲的答复是:同意");  
	}
}
