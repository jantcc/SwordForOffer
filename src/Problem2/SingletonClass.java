package Problem2;

public class SingletonClass {
	/*
	 * java����ģʽ
	 * ��Ŀ�����һ���࣬����ֻ�����ɸ����һ��ʵ��
	 */

	private SingletonClass(){}
	
	private static class SingletonClassInstance{
		private static final SingletonClass instance = new SingletonClass();
	}
	
	private static SingletonClass getInstance(){
		return SingletonClassInstance.instance;
	}
}



