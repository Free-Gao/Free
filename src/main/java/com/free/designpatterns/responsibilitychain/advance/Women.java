package com.free.designpatterns.responsibilitychain.advance;


/**
 * 古代悲哀女性的总称 
 * @author Free
 *
 */
public interface Women{

	//获得个人状况  
	public int getType();    
	
	//获得个人请示，你要干什么？出去逛街？约会?还是看电影  
	public String getRequest(); 
}
