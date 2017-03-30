/**
 * H1³µÄ£
 */
package com.template;

/**
 * @author Administrator
 *
 */
public class MummerH1Model extends MummerModel {
     
	private boolean alarmFlag = true;//ÒªÏìÀ®°È
	/* (non-Javadoc)
	 * @see com.template.MummerModel#start()
	 */
	@Override
	public void start() {
		System.out.println("start....");
	}

	/* (non-Javadoc)
	 * @see com.template.MummerModel#stop()
	 */
	@Override
	public void stop() {
		System.out.println("stop....");
	}

	/* (non-Javadoc)
	 * @see com.template.MummerModel#alarm()
	 */
	@Override
	public void alarm() {
		System.out.println("alarm....");
	}

	/* (non-Javadoc)
	 * @see com.template.MummerModel#engineBoom()
	 */
	@Override
	public void engineBoom() {
		System.out.println("Boom....");
	}
    protected boolean isAlarm(){
    	return this.alarmFlag;
    }
	
	public void setAlarm(boolean isAlarm){
		  this.alarmFlag=isAlarm;
		
	}
	
}
