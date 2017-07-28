/**
 * 
 */
package com.free.designpatterns.state;

/**
 * 在电梯门开启的状态下能做什么事情 
 * @author Free
 * 
 */
public class OpeningState extends LiftState {

	@Override
	public void open() {
		System.out.println("电梯门开启..."); 

	}

	//开启当然可以关闭了，我就想测试一下电梯门开关功能 
	@Override
	public void close() {
		//状态修改 
		super.context.setLiftState(Context.closingState);
		//动作委托为CloseState来执行 
		super.context.getLiftState().close();

	}

	//门开着电梯就想跑，这电梯，吓死你！ 
	@Override
	public void run() {
		// do nothing

	}

	//开门还不停止？ 
	@Override
	public void stop() {
		//do nothing; 

	}

}
