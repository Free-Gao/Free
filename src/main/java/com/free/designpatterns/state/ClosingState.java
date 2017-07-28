/**
 * 
 */
package com.free.designpatterns.state;

/**
 * 电梯门关闭以后，电梯可以做哪些事情 
 * @author Free
 * 
 */
public class ClosingState extends LiftState {

	//电梯门关了再打开，逗你玩呢，那这个允许呀 
	@Override
	public void open() {
		//改变状态
		super.context.setLiftState(Context.openningState);
		super.context.getLiftState().open();

	}

	//电梯门关闭，这是关闭状态要实现的动作 
	@Override
	public void close() {
		System.out.println("电梯门关闭..."); 

	}

	//电梯门关了就跑，这是再正常不过了 
	@Override
	public void run() {
		//改变状态
		super.context.setLiftState(Context.runningState);
		super.context.getLiftState().run();

	}

	//电梯门关着，我就不按楼层 
	@Override
	public void stop() {
		//设置为停止状态；
		 super.context.setLiftState(Context.stoppingState);     
		 super.context.getLiftState().stop(); 

	}

}
