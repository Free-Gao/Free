package com.free.designpatterns.observer;

/**
 * 李斯这个人，是个观察者，只要韩非子一有动静，这边就知道 
 * @author Free
 *
 */
public interface LiSi{

	//首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报 
	public void update(String context);

}
