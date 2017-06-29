package com.free.designpatterns.observer.perfect;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;



/**
 * 韩非子，李斯的师弟，韩国的重要人物 
 * @author Free
 *
 */
public class HanFeiZi extends Observable{

	//韩非子要吃饭了 
	public void haveBreakfast(){
		System.out.println("韩非子:开始吃饭了...");   
		//通知所有观察者
		super.setChanged();
		super.notifyObservers("");
	}

	 //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多 
	public void haveFun(){
		System.out.println("韩非子:开始娱乐了...");   
		//通知所有观察者
		super.setChanged();
		super.notifyObservers("韩非子在娱乐");

	}	

	
}
