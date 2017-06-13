package com.free.designpatterns.factory;

/**
 * 白色人种
 * @author Free
 *
 */
public class WhiteHuman implements Human{

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
