package com.free.designpatterns.abstractfactory.humanfactory;

import com.free.designpatterns.abstractfactory.Human;
import com.free.designpatterns.abstractfactory.HumanEnum;

/**
 *  女性创建工厂
 * @author Free
 *
 */
public class FemaleHumanFactory extends AbstractHumanFactory{

	//创建一个女性黄种人
	public Human createYellowHuman(){
		return super.createHuman(HumanEnum.YelloFemaleHuman);
	}

	//创建一个女性白种人
	public Human createwhiteHuman(){
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}
	
	//创建一个女性黑种人
	public Human createBlackHuman(){
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}

}
