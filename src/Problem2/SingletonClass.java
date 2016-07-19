package Problem2;

public class SingletonClass {
	/*
	 * java单例模式
	 * 题目：设计一个类，我们只能生成该类的一个实例
	 */

	private SingletonClass(){}
	
	private static class SingletonClassInstance{
		private static final SingletonClass instance = new SingletonClass();
	}
	
	private static SingletonClass getInstance(){
		return SingletonClassInstance.instance;
	}
}



