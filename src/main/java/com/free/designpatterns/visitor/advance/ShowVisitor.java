/**
 * 
 */
package com.free.designpatterns.visitor.advance;

/**
 * 负责报表的产生
 * @author Free
 * 
 */
public interface ShowVisitor extends Visitor {

	//展示报表
	public void report(); 
}
