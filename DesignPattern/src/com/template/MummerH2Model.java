/**
 * H2³µÄ£
 */
package com.template;

/**
 * @author Administrator
 *
 */
public class MummerH2Model extends MummerModel {

	/* (non-Javadoc)
	 * @see com.template.MummerModel#start()
	 */
	@Override
	public void start() {
		System.out.println("h2_start....");
	}

	/* (non-Javadoc)
	 * @see com.template.MummerModel#stop()
	 */
	@Override
	public void stop() {
		System.out.println("h2_stop....");
	}

	/* (non-Javadoc)
	 * @see com.template.MummerModel#alarm()
	 */
	@Override
	public void alarm() {
		System.out.println("h2_alarm....");
	}

	/* (non-Javadoc)
	 * @see com.template.MummerModel#engineBoom()
	 */
	@Override
	public void engineBoom() {
		System.out.println("h2_Boom....");
	}
    @SuppressWarnings("unused")
	private boolean isAlarm(){
    	return false;
    }
}
