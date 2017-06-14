package com.free.designpatterns.abstractfactory.yellowhuman;

import com.free.designpatterns.abstractfactory.Human;

/**
 * 为什么要修改成抽象类呢？要定义性别呀 
 * @author Free
 *
 */
public abstract class AbstractYellowHuman implements Human{

	public void laugh(){
		System.out.println("黄色人种会大笑，幸福呀！");

	}

	public void cry(){
		System.out.println("黄色人种会哭"); 

	}

	public void talk(){
		 System.out.println("黄色人种会说话，一般说的都是双字节"); 

	}

}
