package com.free.designpatterns.iterator;

import java.util.ArrayList;

/**
 * 定义一个迭代器 
 * @author Free
 *
 */
public class ProjectIteratorImpl implements ProjectIterator{
	
	//所有的项目都放在这里ArrayList中
	private ArrayList<Project> projectList = new ArrayList<Project>();    
	
	private int currentItem = 0;   

	///构造函数传入projectList 
	public ProjectIteratorImpl(ArrayList<Project> projectList){
		this.projectList = projectList;
	}

	//判断是否还有元素，必须实现 
	public boolean hasNext(){
		boolean b = true;
		if(this.currentItem >= projectList.size() || this.projectList.get(currentItem) == null){
			b = false;
		}
		return b;
	}

	//取得下一个值 
	public Object next(){
		return (Project)projectList.get(this.currentItem++);
	}

}
