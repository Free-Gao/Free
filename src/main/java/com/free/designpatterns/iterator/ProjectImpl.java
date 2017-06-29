package com.free.designpatterns.iterator;

import java.util.ArrayList;

/**
 * 所有项目的信息类 
 * @author Free
 *
 */
public class ProjectImpl implements Project{

	//定义一个项目列表，所有的项目都放在这里  
	private ArrayList<Project> projectList = new ArrayList<Project>();
	
	//项目名称
	private String name = "";
	
	//项目成员数量
	private int num = 0;
	
	//项目费用
	private int cost = 0;
	
	
	public ProjectImpl(){
		
	}

	//定义一个构造函数，把所有老板需要看到的信息存储起来 
	private ProjectImpl(String name, int num, int cost){
		this.name = name;
		this.num = num;
		this.cost = cost;
	}
	
	//增加项目 
	public void add(String name,int num,int cost){
		this.projectList.add(new ProjectImpl(name, num, cost));
		
	}

	//得到项目的信息 
	public String getProjectInfo(){
		String info = "";      
		
		//获得项目的名称   
		info = info+ "项目名称是：" + this.name;  
		
		//获得项目人数   
		info = info + "\t项目人数: "+ this.num; 
		
		//项目费用   
		info = info+ "\t 项目费用："+ this.cost;      
		
		return info;  
	}

	//产生一个遍历对象 
	public ProjectIterator iterator(){
		return new ProjectIteratorImpl(this.projectList);
	}

}
