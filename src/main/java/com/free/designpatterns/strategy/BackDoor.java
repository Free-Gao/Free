package com.free.designpatterns.strategy;

/**
 * 找乔国老帮忙，使孙权不能杀刘备
 * @author Free
 *
 */
public class BackDoor implements Strategy{

	public void operate(){
		System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
	}

}
