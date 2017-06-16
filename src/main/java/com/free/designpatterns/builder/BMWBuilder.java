package com.free.designpatterns.builder;

import java.util.ArrayList;


/**
 * 给定一个顺序，返回一个宝马车 
 * @author Free
 *
 */
public class BMWBuilder extends CarBuilder{

	private BMWModel bmwModel = new BMWModel();
	
	public void setSequence(ArrayList<String> sequence){
		this.bmwModel.setSequence(sequence);

	}

	public CarModel getCarModel(){
		return this.bmwModel;
	}

}
