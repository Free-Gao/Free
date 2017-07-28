/**
 * 
 */
package com.free.designpatterns.visitor;

/**
 * 访问者，我要去访问人家的数据了 
 * @author ruichao.gao
 *
 */
public interface Visitor {

	//首先定义我可以访问普通员工 
	public void visit(CommonEmployee commonEmployee);
	
	//其次我定义我可以访问部门经理
	public void visit(Manager manager);
	
	//统计所有员工工资总和
	public int getTotalSalary(); 
}
