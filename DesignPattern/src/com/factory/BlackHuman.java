/**
 * ∫⁄÷÷»À
 */
package com.factory;

/**
 * @author Administrator
 *
 */
public class BlackHuman implements Human {

	/* (non-Javadoc)
	 * @see com.factory.Human#getColor()
	 */
	@Override
	public void getColor() {
		System.out.println("black");
	}

	/* (non-Javadoc)
	 * @see com.factory.Human#talk()
	 */
	@Override
	public void talk() {
		System.out.println("speak other");
	}

}
