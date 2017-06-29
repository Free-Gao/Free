package com.free.designpatterns.observer;


/**
 * 监控程序 
 * @author Free
 *
 */
public class Watch extends Thread{

	private HanFeiZiImpl hanFeiZi;  
	private LiSiImpl liSi;  
	private String type; 
	
	//通过构造函数传递参数，我要监控的是谁,谁来监控,要监控什么 
	public Watch(HanFeiZiImpl hanFeiZi, LiSiImpl liSi, String type){
		this.hanFeiZi = hanFeiZi;
		this.liSi = liSi;
		this.type = type;
	}
	
	@Override
	public void run(){
		while(true){
			if(this.type.equals("breakfast")){
				if(this.hanFeiZi.isHaveBreakfast()){
					this.liSi.update("韩非子在吃饭");
					//重置转态，继续监控
					this.hanFeiZi.setHaveBreakfast(false);
				}else{//监控是否在娱乐 
					 if(this.hanFeiZi.isHaveFun()){      
						 this.liSi.update("韩非子在娱乐");      
						 this.hanFeiZi.setHaveFun(false);     
					 }   
				}
			}
		}
	}
	

}
