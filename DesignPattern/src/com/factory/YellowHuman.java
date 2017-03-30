/**
 * ª∆÷÷»À
 */
package com.factory;

/**
 * @author Administrator
 *
 */
public class YellowHuman implements Human {

	/* (non-Javadoc)
	 * @see com.factory.Human#getColor()
	 */
	@Override
	public void getColor() {
		System.out.println("yellow human");
	}

	/* (non-Javadoc)
	 * @see com.factory.Human#talk()
	 */
	@Override
	public void talk() {
		System.out.println("speak chinese");
	}

}
