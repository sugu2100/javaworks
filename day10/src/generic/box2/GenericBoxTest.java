package generic.box2;

import generic.Apple;

class Box<T>{  //<T> -> ����ϸ鼭 ���ϴ� �ڷ���
	private T type;
	
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}
}

public class GenericBoxTest {

	public static void main(String[] args) {
		//String �� ���
		Box<String> box1 = new Box<>();
		box1.set("����� �����!");
		String msg = box1.get();
		System.out.println(msg);
		
		//Integer �� ���
		Box<Integer> box2 = new Box<>();
		box2.set(12);
		Integer num = box2.get();
		System.out.println(num);
		
		//Apple �� ���
		Box<Apple> box3 = new Box<>();
		box3.set(new Apple());
		Apple apple = box3.get();
		System.out.println(apple);
	}

}
