package com.free.designpatterns.decorator;


/**
 * 老爸看成绩单了 
 * @author Free
 *
 */
public class Father{

	 
	public static void main(String[] args){
		//成绩单拿过来 
		SchoolReport sr = new FourthGradeSchoolReport();
		
		//加 了高分说明的成绩单  
		sr = new HighScoreDecorator(sr); 
		
		//又加了成绩排名的说明   
		sr = new SortDecorator(sr);  
		
		//看成绩单   
		sr.report();
		
		//然后老爸，一看，很开心，就签名了   
		sr.sign("老三");  //我叫小三，老爸当然叫老三 

		//美化过的成绩单拿过来 
		SchoolReport ssr = new SugarFouthGradeSchoolReport();
		
		//看成绩单
		ssr.report();
		
		//签名，休想
		ssr.sign("老三");
	}

}
