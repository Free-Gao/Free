package com.free.designpatterns.proxy;

/**
 * 那我们再考虑一下，水浒里还有没有这类型的女人？有，卢俊义的老婆贾氏（就是和那个固管家苟合的那个），这名字起的：“假使”，那我们也让王婆做她的代理
 * @author Free
 *
 */
public class JiaShi implements Kindwomen{

	public void makeEyesWithMan(){
		System.out.println("贾氏抛媚眼"); 

	}

	public void happyWithMan(){
		System.out.println("贾氏正在Happy中......"); 
	}

}
