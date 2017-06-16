package com.free.designpatterns.command;

import com.free.designpatterns.command.command.AddRequirementCommand;
import com.free.designpatterns.command.command.Command;
import com.free.designpatterns.command.command.DeletePageCommand;

/**
 *客户就是甲方，给我们钱的一方，是老大 
 * @author Free
 *
 */
public class Client{

	public static void main(String[] args){
		 //首先客户找到需求组说，过来谈需求，并修改   
		System.out.println("-------------客户要求增加一个需求-----------------");   
		Group rg = new RequirementGroup();   
		//找到需求组   
		rg.find();      
		//增加一个需求   
		rg.add();      
		//要求变更计划   
		rg.plan();
		
		//首先客户找到美工组说，过来谈页面，并修改   
		System.out.println("-------------客户要求删除一个页面-----------------");   
		Group pg = new PageGroup();   
		//找到需求组   
		pg.find();      
		//增加一个需求  
		pg.delete();      
		//要求变更计划  
		pg.plan(); 
		
		//定义我们的接头人 
		Invoker invoker = new Invoker();
		
		//客户要求增加一项需求  
		System.out.println("-------------客户要求增加一项需求-----------------");   
		//客户给我们下命令来 
		//Command command = new AddRequirementCommand();
		Command command = new DeletePageCommand();
		
		//接头人接收到命令 
		invoker.setCommand(command);
		
		//接头人执行命令 
		invoker.action();
	}
}
