/**
 * �����ʵ���
 */
package com.singleton;

/**
 * @author Administrator
 *
 */
public class Emperor {
	//��ʼ��һ���ʵ�
	private static final Emperor emperor =new Emperor(); 
	
	public Emperor(){
		
	}
	public static Emperor getInstance(){
		return emperor;
		
	}
	
	//���Ϸ���
	public static void say(){	
		System.out.println("�Ҿ��ǻ��ϣ�");
	}
	
	
     
}
