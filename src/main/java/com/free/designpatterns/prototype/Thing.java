/**
 * 
 */
package com.free.designpatterns.prototype;

import java.util.ArrayList;

/**
 * 1.对象拷贝时，类的构造函数是不会被执行的
 * 2.浅拷贝和深拷贝问题
 * 3.Clone 与 final 两对冤家。
 * @author Free
 * 
 */
public class Thing implements Cloneable {

	public Thing(){   
		System.out.println("构造函数被执行了...");  
	}
	
	//定义一个私有变量  
	private ArrayList<String> arrayList = new ArrayList<String>();
	
	@Override
	protected Thing clone() {
		Thing thing = null;
		
		try {
			thing = (Thing)super.clone();
			//浅拷贝，内部的数组和引用对象不被拷贝，其他的原始类型比如int,long,String(Java 就希望你把 String 认为是基本类型，String 是没有 clone 方法的)等都会被拷贝的。
			thing.arrayList = (ArrayList<String>)this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return thing;
	}

	  //设置arrayList的值 
	public void setValue(String value){   
		this.arrayList.add(value);  
	}    
	
	//取得arrayList的值  
	public ArrayList<String> getValue(){   
		return this.arrayList;  
	}   
	
}
