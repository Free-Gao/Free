package com.free.designpatterns.facade;

/**
 * 增加了一个门面，Client 调用时，直接调用门面的方法就可以了，不用了解具体的实现方法以及相关的业务顺序
 * @author Free
 *
 */
public class ModenPostOffice{
	private LetterProcess letterProcess = new LetterProcessImpl();
	private LetterPolice letterPolice = new LetterPolice();
	
	//写信，封装，投递，一体化了 
	public void sendLetter(String context, String address){
		 //帮你写信   
		letterProcess.writeContext(context);      
		//写好信封  
		letterProcess.fillEnvelope(address);   
		//突然一个非常时期，寄往 God Province（上帝省）的邮件都必须进行安全检查，那我们这个就很好处理了，
		letterPolice.checkLetter(letterProcess);
		//把信放到信封中   
		letterProcess.letterIntoEnvelope();      
		//邮递信件
		letterProcess.sendLetter(); 
	}
}
