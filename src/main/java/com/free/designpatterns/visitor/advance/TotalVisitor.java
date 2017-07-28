/**
 * 
 */
package com.free.designpatterns.visitor.advance;

/**
 * 负责统计报表的产生
 * @author Free
 * 
 */
public interface TotalVisitor extends Visitor {

	// 统计所有员工工资总和
	public void totalSalary(); 
}
