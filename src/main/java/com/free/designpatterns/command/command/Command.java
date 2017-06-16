package com.free.designpatterns.command.command;

import com.free.designpatterns.command.CodeGroup;
import com.free.designpatterns.command.PageGroup;
import com.free.designpatterns.command.RequirementGroup;

/**
 *命令的抽象类，我们把客户发出的命令定义成一个一个的对象 
 * @author Free
 *
 */
public abstract class Command{

	//把三个组都定义好，子类可以直接使用 
	protected RequirementGroup rg = new RequirementGroup();  //需求组 
	protected PageGroup pg = new PageGroup();  //美工组 
	protected CodeGroup cg = new CodeGroup(); //代码组; 
	
	public abstract void execute();
}
