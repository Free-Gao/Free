package com.free.designpatterns.strategy;

/**
 * 求吴国太开个绿灯
 * @author Free
 *
 */
public class GivenGreenLight implements Strategy{

	public void operate(){
		System.out.println("求吴国太开个绿灯,放行！"); 
	}

}
