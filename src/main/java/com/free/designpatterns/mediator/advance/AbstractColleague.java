/**
 * 
 */
package com.free.designpatterns.mediator.advance;

/**
 * 同事抽象类
 * 每个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中介者角色协作
 * 每个同事类的行为分为两种：
 * 一种是同事本身的行为，比如改变对象本身的状态，处理自己的行为等等，这种方法叫做自发行为(Self-Method)，与其他的同事类或中介者没有任何的依赖；
 * 第二种是是必须依赖中介者才能完成的行为，叫做依赖方法（Dep-Method）
 * @author Free
 * 
 */
public abstract class AbstractColleague {

	//各类共享中介类
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
}
