/**
 * 创建皇帝类
 */
package com.singleton;

/**
 * @author Administrator
 *
 */
public class Emperor {
	//初始化一个皇帝
	private static final Emperor emperor =new Emperor(); 
	
	public Emperor(){
		
	}
	public static Emperor getInstance(){
		return emperor;
		
	}
	
	//皇上发话
	public static void say(){	
		System.out.println("我就是皇上！");
	}
	
	
     
}
