package com.free.designpatterns.facade;

/**
 *  定义一个写信的过程 
 * @author Free
 *
 */
public interface LetterProcess{
	
	//首先要写信的内容
	public void writeContext(String context);
	
	//其次写信封
	public void fillEnvelope(String address);
	
	//把信放到信封
	public void letterIntoEnvelope();
	
	//然后投递
	public void sendLetter();
}
