package com.free.designpatterns.builder;

import java.util.ArrayList;


/**
 * 各种设施都给了，我们按照一定的顺序制造一个奔驰车 
 * @author Free
 *
 */
public class BenzBuilder extends CarBuilder{

	private BenzModel benzModel = new BenzModel();
	
	@Override
	public void setSequence(ArrayList<String> sequence){
		this.benzModel.setSequence(sequence);

	}

	@Override
	public CarModel getCarModel(){
		return this.benzModel;
	}

}
