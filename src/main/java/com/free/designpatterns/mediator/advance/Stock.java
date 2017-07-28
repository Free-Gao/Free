/**
 * 
 */
package com.free.designpatterns.mediator.advance;

/**
 * 库存
 * @author Free
 * 
 */
public class Stock extends AbstractColleague{

	public Stock(AbstractMediator mediator) {
		super(mediator);
	}
	//刚开始有100台电脑  
	private static int COMPUTER_NUMBER =100;      
	
	//库存增加  
	public void increase(int number){   
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;   
		System.out.println("库存数量为："+COMPUTER_NUMBER);  
	}    
	
	//库存降低  
	public void decrease(int number){   
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;   
		System.out.println("库存数量为："+COMPUTER_NUMBER);  
	}    
	
	//获得库存数量  
	public int getStockNumber(){   
		return COMPUTER_NUMBER;  
	}   
	//存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售  
	public void clearStock(){
		super.mediator.execute("stock.clear");
	}
}
