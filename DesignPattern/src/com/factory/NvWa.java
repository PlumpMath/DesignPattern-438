/**
 * 客户端----女娲 ，女娲造人的故事
 */
package com.factory;

/**
 * @author Administrator
 *
 */
public class NvWa {

	/**	
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractHumanFactory nvwa = new HumanFactory();
		Human yellowMan= nvwa.createHuman(YellowHuman.class);
		yellowMan.getColor();
		yellowMan.talk();
		
		Human whiteHuman= nvwa.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		Human blackHuman= nvwa.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		

	}

}
