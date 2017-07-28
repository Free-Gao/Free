/**
 * 
 */
package com.free.designpatterns.visitor.advance;

/**
 * 普通员工，也就是小的小兵 
 * @author ruichao.gao
 *
 */
public class CommonEmployee extends Employee {

	//工作内容，这个非常重要，以后的职业规划就是靠这个了 
	private String job; 
	 
	public String getJob() {   
		return job;  
	} 
	 
	public void setJob(String job) {   
		this.job = job;  
	}
	
	//允许访问者访问
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

}
