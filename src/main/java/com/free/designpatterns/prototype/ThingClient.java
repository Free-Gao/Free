/**
 * 
 */
package com.free.designpatterns.prototype;

/**
 * 
 * @author Free
 * 
 */
public class ThingClient {

	public static void main(String[] args) {
		Thing thing = new Thing();
		
		//设置一个值   
		thing.setValue("张三"); 
		//拷贝一个对象 
		Thing cloneThing = thing.clone();
		cloneThing.setValue("李四"); 
		
		System.out.println(thing.getValue()); 

	}

}
