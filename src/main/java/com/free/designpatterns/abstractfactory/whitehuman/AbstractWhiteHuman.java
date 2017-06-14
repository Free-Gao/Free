package com.free.designpatterns.abstractfactory.whitehuman;

import com.free.designpatterns.abstractfactory.Human;

/**
 * 为什么要修改成抽象类呢？要定义性别呀 
 * @author Free
 *
 */
public abstract class AbstractWhiteHuman implements Human{

	public void laugh(){
		System.out.println("白色人种会大笑，侵略的笑声");

	}

	public void cry(){
		System.out.println("白色人种会哭"); 

	}

	public void talk(){
		System.out.println("白色人种会说话，一般都是但是单字节！");

	}

}
