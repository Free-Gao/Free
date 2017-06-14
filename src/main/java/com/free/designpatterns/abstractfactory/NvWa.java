package com.free.designpatterns.abstractfactory;

import com.free.designpatterns.abstractfactory.humanfactory.FemaleHumanFactory;
import com.free.designpatterns.abstractfactory.humanfactory.HumanFactory;
import com.free.designpatterns.abstractfactory.humanfactory.MaleHumanFactory;

public class NvWa{
	public static void main(String[] args){
		
		//第一条生产线，男性生产线 
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		 //第二条生产线，女性生产线 
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		
		//生产线建立完毕，开始生产人了:
		Human whiteMaleHuman = maleHumanFactory.createwhiteHuman();
		Human BlackFemaleHuman = femaleHumanFactory.createBlackHuman();
		
		whiteMaleHuman.cry();
		BlackFemaleHuman.laugh();
		whiteMaleHuman.talk();
	}
}
