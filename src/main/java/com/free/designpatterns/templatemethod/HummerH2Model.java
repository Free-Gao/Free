package com.free.designpatterns.templatemethod;


/**
 * H1和H2有什么差别，还真不知道，真没接触过悍马
 * @author Free
 *
 */
public class HummerH2Model extends HummerModel{

	private boolean alarmFlag = true;  //是否要响喇叭 
	
	@Override
	protected void start(){
		System.out.println("悍马H2发动..."); 
	}

	@Override
	protected void stop(){
		System.out.println("悍马H2停车...");
		
	}

	@Override
	protected void alarm(){
		System.out.println("悍马H2鸣笛..."); 
		
	}

	@Override
	protected void engineBoom(){
		System.out.println("悍马H2引擎声音是这样在..."); 
		
	}

	@Override
	protected boolean isAlarm(){
		return this.alarmFlag;
	}

	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}
}
