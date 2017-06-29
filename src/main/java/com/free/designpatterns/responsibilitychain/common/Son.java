package com.free.designpatterns.responsibilitychain.common;


/**
 *儿子类
 * @author Free
 *
 */
public class Son implements Handler{

	//目前向儿子请示  
	public void HandleMessage(Women women) {   
		System.out.println("母亲的请示是："+women.getRequest());   
		System.out.println("儿子的答复是：同意");  
	}
}
