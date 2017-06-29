package com.free.designpatterns.responsibilitychain.common;


/**
 * 父系社会，那就是男性有至高权利，handler控制权 
 * @author Free
 *
 */
public interface Handler{

	//一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求  
	public void HandleMessage(Women women); 
}
