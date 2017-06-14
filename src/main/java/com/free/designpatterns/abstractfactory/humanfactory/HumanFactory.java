package com.free.designpatterns.abstractfactory.humanfactory;

import com.free.designpatterns.abstractfactory.Human;
/**
 *  这次定一个接口，应该要造不同性别的人，需要不同的生产线 
 *  那这个八卦炉必须可以制造男人和女人
 * @author Free
 *
 */
public interface HumanFactory{
	
	//制造黄种人
	public Human createYellowHuman();
	
	//制造白种人
	public Human createwhiteHuman();
	
	//制造黑种人
	public Human createBlackHuman();
}
