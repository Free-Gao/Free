/**
 * 
 */
package com.free.designpatterns.mediator.advance;

/**
 * 中介者抽象类
 * 抽象中介者角色定义统一的接口用于各同事角色之间的通信。 
 * @author Free
 * 
 */
public abstract class AbstractMediator {

	protected Purchase purchase;  
	protected Sale sale;  
	protected Stock stock;
	 
	public AbstractMediator() {
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}
	 
	//中介者重要的方法，叫做事件方法，处理多个对象之间的关系 
	public abstract void execute(String str, Object...objects);
}
