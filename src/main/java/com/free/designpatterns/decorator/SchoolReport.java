package com.free.designpatterns.decorator;


/**
 * 成绩单的抽象类
 * @author Free
 *
 */
public abstract class SchoolReport{

	//成绩单的主要展示的就是你的成绩情况 
	public abstract void report();
	
	//成绩单要家长签字，这个是要命的 
	public abstract void sign(String name);
}
