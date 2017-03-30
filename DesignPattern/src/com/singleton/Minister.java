/**
 * 创建臣子类
 */
package com.singleton;

/**
 * @author Administrator
 *
 */
public class Minister {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		for(int day = 0;day<=3;day++){
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}

	}

}
