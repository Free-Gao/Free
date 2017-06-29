package com.free.designpatterns.composite;


/**
 * 定义一个公司的人员的抽象类 
 * @author Free
 *
 */
public abstract class Corp{

	//公司每个人都有名称 
	private String name = "";  
	//公司每个人都职位  
	private String position = "";  
	//公司每个人都有薪水 
	private int salary =0;
	//父节点是谁
	private Corp parent = null;
	//构造函数
	public Corp(String name, String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
		
	} 
	
	//获得员工信息 
	public String getInfo(){   
		String info = "";   
		info = "姓名：" + this.name;   
		info = info + "\t职位："+ this.position;   
		info = info + "\t薪水：" + this.salary;   
		return info;  
	}
	
	//设置父节点
	protected void setParent(Corp _parent){   
		this.parent = _parent;  
	}    
	
	// 得到父节点
	public Corp getParent(){   
		return this.parent;  
	} 
}
