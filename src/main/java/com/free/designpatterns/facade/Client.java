package com.free.designpatterns.facade;

/**
 * 我开始给朋友写信了 
 * @author Free
 *
 */
public class Client{
	
	public static void main(String[] args){
		LetterProcess letterProcess = new LetterProcessImpl();
		String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
		String address = "Happy Road No. 666,God Province,Heaven";
		//开始写信
		letterProcess.writeContext(context);
		//开始写信封
		letterProcess.fillEnvelope(address);
		//把信放到信封，并封装好
		letterProcess.letterIntoEnvelope();
		//投递
		letterProcess.sendLetter();
		//那这个过程与高内聚的要求相差甚远，你想，你要知道这四个步骤，而且还要知道这四个步骤的顺序，一旦出错，信就不可能邮寄出去,穷则思变
		
		//你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作； 
		ModenPostOffice modenPostOffice = new ModenPostOffice();
		modenPostOffice.sendLetter(context, address);
	}
}
