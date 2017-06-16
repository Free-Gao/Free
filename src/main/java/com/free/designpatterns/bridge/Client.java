package com.free.designpatterns.bridge;

import com.free.designpatterns.bridge.abstraction.HouseCorp;
import com.free.designpatterns.bridge.abstraction.ShanZhaiCorp;
import com.free.designpatterns.bridge.implementor.House;
import com.free.designpatterns.bridge.implementor.IPod;
/**
 * 我要关心我自己的公司了
 * @author Free
 *
 */
public class Client{

	public static void main(String[] args){
		System.out.println("-------房地产公司是这个样子运行的-------");   
		//先找到我的公司  
//		HouseCorp houseCorp =new HouseCorp(); 
		HouseCorp houseCorp = new HouseCorp(new House());
		//看我怎么挣钱   
		houseCorp.makeMoney();   
		System.out.println("\n");      
//		
//		System.out.println("-------服装公司是这样运行的-------");   
//		ClothesCorp clothesCorp = new ClothesCorp();   
//		clothesCorp.makeMoney();
		
		
		
		 //山寨公司生产的产品很多，不过我只要指定产品就成了   
		System.out.println("-------山寨公司是这样运行的-------");   
		//ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod()); 
		shanZhaiCorp.makeMoney(); 
	}
}
