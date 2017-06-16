package com.free.designpatterns.command.command;


/**
 * 增加一项需求 
 * @author Free
 *
 */
public class AddRequirementCommand extends Command{

	//执行增加一项需求的命令 
	@Override
	public void execute(){

		 //找到需求组   
		super.rg.find();      
		//增加一份需求   
		super.rg.add();  
		
		//可以组合
		// 页面也要增加
	    super.pg.add();      
	    // 功能也要增加
	    super.cg.add();   
		//给出计划   
		super.rg.plan(); 

	}

}
