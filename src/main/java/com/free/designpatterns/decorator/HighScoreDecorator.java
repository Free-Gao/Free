package com.free.designpatterns.decorator;


/**
 * 我要把我学校的高成绩告诉老爸 
 * @author Free
 *
 */
public class HighScoreDecorator extends Decorator{

	//构造函数 
	public HighScoreDecorator(SchoolReport sr){
		super(sr);
	}

	//我要汇报最高成绩 
	private void reportHighScore(){
		System.out.println("这次考试语文最高分是75，数学最高分是78，自然最高分是80"); 
	}
	
	//高成绩我要做老爸看成绩单前告诉他，否则等他一看，就抡起笤帚有揍我，我那还有机会说呀 
	public void report(){
		this.reportHighScore();
		super.report();
	}
}

