package com.free.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 节点类，也简单了很多 
 * @author Free
 *
 */
public class Branch extends Corp{

	//领导下边有那些下级领导和小兵 
	List<Corp> subordinateList = new ArrayList<Corp>();
	
	//构造函数是必须的了 
	public Branch(String name, String position, int salary){
		super(name, position, salary);
	}
	
	//增加一个下属，可能是小头目，也可能是个小兵 
	public void addSubordinate(Corp corp){
		corp.setParent(this); //设置父节点
		this.subordinateList.add(corp);
	}
	
	//我有哪些下属 
	public List<Corp> getSubordinate(){
		return this.subordinateList;
	}
}
