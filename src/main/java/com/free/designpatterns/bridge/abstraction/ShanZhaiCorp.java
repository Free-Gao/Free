package com.free.designpatterns.bridge.abstraction;

import com.free.designpatterns.bridge.implementor.Product;

/**
 * 我是山寨老大，你流行啥我就生产啥 
 * @author Free
 *
 */
public class ShanZhaiCorp extends Corp{

	public ShanZhaiCorp(Product product){
		super(product);
	}

	//狂赚钱  
	public void makeMoney(){   
		super.makeMoney();   
		System.out.println("我赚钱呀...");  
	}
}
