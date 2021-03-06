package com.free.designpatterns.adapter;

import java.util.Map;

/**
 * 转换器
 * @author Free
 *
 */
public class OuterUserInfo extends OuterUserImpl implements UserInfo{
	
	private Map baseInfo = super.getUserBaseInfo();  //员工的基本信息  
	private Map homeInfo = super.getUserHomeInfo(); //员工的家庭 信息 
	private Map officeInfo = super.getUserOfficeInfo(); //工作信息 
	
	//员工姓名
	public String getUserName(){
		String userName = (String)this.baseInfo.get("userName");   
		System.out.println(userName);  
		return userName; 
	}

	//家庭地址
	public String getHomeAddress(){
		String homeAddress = (String)this.homeInfo.get("homeAddress");   
		System.out.println(homeAddress);   
		return homeAddress;  
	}

	//手机号
	public String getMobileNumber(){
		String mobileNumber = (String)this.baseInfo.get("mobileNumber");   
		System.out.println(mobileNumber);   
		return mobileNumber; 
	}

	//办公电话
	public String getOfficeTelNumber(){
		String officeTelNumber = (String)this.officeInfo.get("officeTelNumber");   
		System.out.println(officeTelNumber);   
		return officeTelNumber;
	}

	//职位
	public String getJobPosition(){
		 String jobPosition = (String)this.officeInfo.get("jobPosition");   
		 System.out.println(jobPosition);   
		 return jobPosition;
	}

	//家庭电话
	public String getHomeTelNumber(){
		String homeTelNumber = (String)this.homeInfo.get("homeTelNumber");   
		System.out.println(homeTelNumber);   
		return homeTelNumber; 
	}

}
