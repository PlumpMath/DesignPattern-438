/**
 *  车模抽象类
 */
package com.template;

/**
 * @author Administrator
 *
 */
public abstract class MummerModel {
	public abstract void start();
	public abstract void stop();
	public abstract void alarm();
	public abstract void engineBoom();
	final public void run(){
		 this.start();
		 this.engineBoom();
		 if(this.isAlarm()){
			 this.alarm();
		 }
	}
	private  boolean isAlarm(){
		
		return true;
		
	}

}
