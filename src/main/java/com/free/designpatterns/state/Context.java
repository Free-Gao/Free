/**
 * 
 */
package com.free.designpatterns.state;

/**
 * 电梯状态转换的共享环境
 * @author Free
 * 
 */
public class Context {

	//定义出所有的电梯状态 
	public static final ClosingState closingState = new ClosingState();
	public static final OpeningState openningState = new OpeningState();
	public static final RunningState runningState = new RunningState();
	public static final StoppingState stoppingState = new StoppingState();
	
	//定一个当前电梯状态 
	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		//把当前的环境通知各实现类·1
		this.liftState.setContext(this);
	}
	
	public void open(){
		this.liftState.open();
	}
	
	public void close(){
		this.liftState.close();
	}
	
	public void run(){
		this.liftState.run();
	}
	
	public void stop(){
		this.liftState.stop();
	}
}
