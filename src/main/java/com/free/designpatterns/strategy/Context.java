package com.free.designpatterns.strategy;

/**
 * 装计谋的锦囊
 * @author Free
 *
 */
public class Context{
	//constructor 要使用的妙计
	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	//使用计谋，看我出招了
	public void operate(){
		this.strategy.operate();
	}
}
