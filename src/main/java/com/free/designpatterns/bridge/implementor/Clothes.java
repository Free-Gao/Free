package com.free.designpatterns.bridge.implementor;


/**
 *我集团公司生产的衣服 
 * @author Free
 *
 */
public class Clothes extends Product{

	@Override
	public void beProduced(){
		System.out.println("生产出的衣服是这个样子的..."); 

	}

	@Override
	public void beSelled(){
		System.out.println("生产出的衣服卖出去了..."); 

	}

}
