package com.free.designpatterns.adapter;

import java.util.Map;

/**
 * 外系统的人员信息 
 * @author Free
 *
 */
public interface OuterUser{
	//基本信息，比如名称，性别，手机号码了等  
	public Map getUserBaseInfo();    
	//工作区域信息 
	public Map getUserOfficeInfo();    
	//用户的家庭信息  
	public Map getUserHomeInfo(); 
}
