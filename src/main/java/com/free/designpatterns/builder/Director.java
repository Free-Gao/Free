package com.free.designpatterns.builder;

import java.util.ArrayList;

/**
 * 导演安排顺序，生产车辆模型 
 * @author Free
 *
 */
public class Director{

	private ArrayList<String> sequence = new ArrayList();  
	private BenzBuilder benzBuilder = new BenzBuilder(); 
	private BMWBuilder bmwBuilder = new BMWBuilder(); 
	
	// A类型的奔驰车模型，先start,然后stop,其他什么引擎了，喇叭一概没有 
	public BenzModel getABenzModel(){
		//清理场景，这里是一些初级程序员不注意的地方 
		this.sequence.clear();
		
		 //这只ABenzModel的执行顺序 
		this.sequence.add("start");
		this.sequence.add("stop");
		
		//按照顺序返回一个奔驰车 
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	
	// B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭  
	public BenzModel getBBenzModel(){
		//清理场景，这里是一些初级程序员不注意的地方 
		this.sequence.clear();
		
		//这只BBenzModel的执行顺序 
		this.sequence.add("engine boom"); 
		this.sequence.add("start");
		this.sequence.add("stop");
		
		//按照顺序返回一个奔驰车 
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	
	//  C型号的宝马车是先按下喇叭（炫耀嘛），然后启动，然后停止
	public BMWModel getCBMWModel(){
		//清理场景，这里是一些初级程序员不注意的地方 
		this.sequence.clear();
		
		 this.sequence.add("alarm"); 
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel)this.bmwBuilder.getCarModel();
	}
}
