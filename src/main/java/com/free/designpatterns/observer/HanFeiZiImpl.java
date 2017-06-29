package com.free.designpatterns.observer;


/**
 * 韩非子，李斯的师弟，韩国的重要人物 
 * @author Free
 *
 */
public class HanFeiZiImpl implements HanFeiZi{
	//韩非子是否在吃饭，作为监控的判断标准 
	private boolean isHaveBreakfast = false;
	//韩非子是否在吃饭，作为监控的判断标准 
	private boolean isHaveFun = false;
	
	//韩非子要吃饭了 
	public void haveBreakfast(){
		System.out.println("韩非子:开始吃饭了...");   
		this.isHaveBreakfast =true; 
	}

	 //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多 
	public void haveFun(){
		System.out.println("韩非子:开始娱乐了...");   
		this.isHaveFun = true; 

	}

	//以下是bean的基本方法，getter/setter，不多说 
	public boolean isHaveBreakfast(){
		return isHaveBreakfast;
	}

	
	public void setHaveBreakfast(boolean isHaveBreakfast){
		this.isHaveBreakfast = isHaveBreakfast;
	}

	
	public boolean isHaveFun(){
		return isHaveFun;
	}

	
	public void setHaveFun(boolean isHaveFun){
		this.isHaveFun = isHaveFun;
	}

	
}
