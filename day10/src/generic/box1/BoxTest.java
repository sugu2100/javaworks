package generic.box1;

import generic.Apple;

class Box{
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("����� �����!");  //���ڿ� ����
		String msg = (String) box.get(); 
		System.out.println(msg);
		
		//��ü Ÿ�� ����
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		System.out.println(apple);
	}

}
