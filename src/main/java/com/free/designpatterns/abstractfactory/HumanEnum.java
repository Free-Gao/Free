package com.free.designpatterns.abstractfactory;


public enum HumanEnum{
	//把世界上所有人类型都定义出来 
	YelloMaleHuman("com.free.designpatterns.abstractfactory.yellowhuman.YellowMaleHuman"),    
	YelloFemaleHuman("com.free.designpatterns.abstractfactory.yellowhuman.YellowFemaleHuman"),    
	WhiteFemaleHuman("com.free.designpatterns.abstractfactory.whitehuman.WhiteFemaleHuman"),   
	WhiteMaleHuman("com.free.designpatterns.abstractfactory.whitehuman.WhiteMaleHuman"),    
	BlackFemaleHuman("com.free.designpatterns.abstractfactory.blackhuman.BlackFemaleHuman"),     
	BlackMaleHuman("com.free.designpatterns.abstractfactory.blackhuman.BlackMaleHuman");

	private String value = "";

	//定义构造函数，目的是Data(value)类型的相匹配 
	private HumanEnum(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
}
