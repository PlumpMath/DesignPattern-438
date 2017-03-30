package com.factory;

public class HumanFactory implements AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human =null;
		try {
			 human = (Human) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("�������ɴ���");
		}
		return (T) human;
	}

}
