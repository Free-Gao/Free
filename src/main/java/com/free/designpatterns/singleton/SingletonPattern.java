package com.free.designpatterns.singleton;

/**
 * 涉及到并发的通用单例模式
 * @author Free
 *
 */
public class SingletonPattern{
	private static final SingletonPattern singletonPattern = new SingletonPattern();
	
	private SingletonPattern(){
		//还是不给new
	}
	
	//代价很高的同步锁
	public synchronized static  SingletonPattern getInstance(){
		return singletonPattern;
	}
}
