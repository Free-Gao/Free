package com.free.designpatterns.proxy;

/**
 * 王婆这个人老聪明了，她太老了，是个男人都看不上
 * 但是她有智慧有经验呀，她作为一类女人的代理！
 * @author Free
 *
 */
public class WangPo implements Kindwomen{
	private Kindwomen kindwomen;
	
	public WangPo(){ //默认的话，是潘金莲的代理
		this.kindwomen = new PanJinLian();
	}
	
	//她可以是KindWomen的任何一个女人的代理，只要你是这一类型
	public WangPo(Kindwomen kindwomen){
		this.kindwomen = kindwomen;
	}

	public void makeEyesWithMan(){
		this.kindwomen.makeEyesWithMan();  //自己老了，干不了，可以让年轻的代替
	}

	public void happyWithMan(){
		this.kindwomen.happyWithMan();  //王婆这么大年龄了，谁看她抛媚眼？！
	}

}
