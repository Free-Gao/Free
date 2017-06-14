package com.free.designpatterns.abstractfactory.humanfactory;

import com.free.designpatterns.abstractfactory.Human;
import com.free.designpatterns.abstractfactory.HumanEnum;

/**
 * 编写一个抽象类，根据enum创建一个人类出来 
 * @author Free
 *
 */
public abstract class AbstractHumanFactory implements HumanFactory{
	
	/*  
	 * 给定一个性别人种，创建一个人类出来 专业术语是产生产品等
	 */ 
	protected Human createHuman(HumanEnum humanEnum){
		Human human = null;
		 //如果传递进来不是一个Enum中具体的一个Element的话，则不处理 
		if(!humanEnum.getValue().equals("")){
			try{
				//直接产生一个实例 
				human = (Human)Class.forName(humanEnum.getValue()).newInstance();
			}catch (Exception e){
				//因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题； 
				e.printStackTrace();
			}
		}
		return human;
	}

}
