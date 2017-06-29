package com.free.designpatterns.observer.perfect;


/**
 *这个Client就是我们，用我们的视角看待这段历史 
 * @author Free
 *
 */
public class Client{

	public static void main(String[] args) throws InterruptedException{
		//定义出韩非子和李斯 
		LiSi liSi = new LiSi();
		WangSi wangSi = new WangSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		//我们后人根据历史，描述这个场景，有两个人在观察韩非子   
		hanFeiZi.addObserver(liSi);   
		hanFeiZi.addObserver(wangSi);   
		
		//然后这里我们看看韩非子在干什么   
		hanFeiZi.haveBreakfast();      
		hanFeiZi.haveFun(); 
	}

}
