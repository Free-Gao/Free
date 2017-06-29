package com.free.designpatterns.observer.perfect;

import java.util.Observable;
import java.util.Observer;

/**
 * 李斯这个人，是个观察者，只要韩非子一有动静，这边就知道 
 * @author Free
 *
 */
public class WangSi implements Observer{

	//首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报 
	public void update(Observable o,Object obj){
		System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");  
		this.cry(obj.toString());   
		System.out.println("王斯：真真的哭死了...\n");  

	}
	
	//汇报给秦始皇 
	private void cry(String context){   
		System.out.println("王斯：因为"+context+"，——所以我悲伤呀！"); 
	}

}
