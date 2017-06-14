package com.free.designpatterns.abstractfactory.humanfactory;

import com.free.designpatterns.abstractfactory.Human;
import com.free.designpatterns.abstractfactory.HumanEnum;

/**
 *  男性创建工厂
 * @author Free
 *
 */
public class MaleHumanFactory extends AbstractHumanFactory{

	//创建一个男性黄种人 
	public Human createYellowHuman(){
		return super.createHuman(HumanEnum.YelloMaleHuman);
	}

	//创建一个男性白种人 
	public Human createwhiteHuman(){
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}
	
	//创建一个男性黑种人 
	public Human createBlackHuman(){
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

}
