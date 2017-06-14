package com.free.designpatterns.abstractfactory.blackhuman;

import com.free.designpatterns.abstractfactory.Human;

/**
 * 为什么要修改成抽象类呢？要定义性别呀 
 * @author Free
 *
 */
public abstract class AbstractBlackHuman implements Human{

	public void laugh(){
		System.out.println("黑人会笑"); 

	}

	public void cry(){
		System.out.println("黑人会哭");

	}

	public void talk(){
		System.out.println("黑人可以说话，一般人听不懂"); 

	}
}
