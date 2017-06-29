package com.free.designpatterns.iterator;

/**
 * 老板来看项目信息了 
 * @author Free
 *
 */
public class Boss{

	public static void main(String[] args){
		Project project = new ProjectImpl();
		
		//增加星球大战项目    
		project.add("星球大战项目",10,100000); 

		//增加扭转时空项目    
		project.add("扭转时空项目",100,10000000);    
		
		//增加超人改造项目    
		project.add("超人改造项目",10000,1000000000); 
		
		//这边100个项目    
		for(int i=4;i<104;i++){     
			project.add("第"+i+"个项目",i*5,i*1000000);    
		}        
		
		//遍历一下ArrayList，把所有的数据都取出
		ProjectIterator projectIterator = project.iterator();
		while (projectIterator.hasNext()){
			Project p = (Project) projectIterator.next();
			System.out.println(p.getProjectInfo());
		} 
	}

}
