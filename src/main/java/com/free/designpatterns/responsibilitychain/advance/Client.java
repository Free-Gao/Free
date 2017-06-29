package com.free.designpatterns.responsibilitychain.advance;

import java.util.ArrayList;
import java.util.Random;

/**
 *我们后人来看这样的社会道德 
 * @author Free
 *
 */
public class Client{

	public static void main(String[] args){
		//随机挑选几个女性   
		Random rand = new Random();   
		ArrayList<Women> arrayList = new ArrayList();   
		for(int i=0;i<5;i++){    
			arrayList.add(new WomenImpl(rand.nextInt(4),"我要出去逛街"));   
		} 
		 
		 //定义三个请示对象  
		Handler father = new Father();   
		Handler husband = new Husband();   
		Handler son = new Son();      
		
		 //设置请示顺序   
		father.setNext(husband);   
		husband.setNext(son);   
		for(Women women:arrayList){   
			father.handleMessage(women);
		}

	}

}
