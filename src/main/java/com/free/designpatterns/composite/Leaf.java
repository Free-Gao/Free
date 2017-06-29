package com.free.designpatterns.composite;


/**
 * 普通员工很简单，就写一个构造函数就可以了 
 * @author Free
 *
 */
public class Leaf extends Corp{

	//就写一个构造函数，这个是必须的 
	public Leaf(String name, String position, int salary){
		super(name, position, salary);
	}

}
