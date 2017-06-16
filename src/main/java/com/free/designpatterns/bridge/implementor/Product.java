package com.free.designpatterns.bridge.implementor;


/**
 * 这是我整个集团公司的产品类 
 * @author Free
 *
 */
public abstract class Product{

	//甭管是什么产品它总要是能被生产出来 
	public abstract void beProduced();
	
	//生产出来的东西，一定要销售出去，否则亏本呀 
	public abstract void beSelled();
}
