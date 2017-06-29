package com.free.designpatterns.iterator;


/**
 * 所有项目的信息类 
 * @author Free
 *
 */
public interface Project{

	//增加项目
	public void add(String name, int num, int cost);
	
	//从老板这里看到的就是项目信息 
	public String getProjectInfo();
	
	//获得一个可以被遍历的对象
	public ProjectIterator iterator();
}
