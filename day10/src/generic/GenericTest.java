package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("grape");
		list.add("egg");
		list.add("coffee");
		
		String str1 = list.get(1);
		System.out.println(str1);
		//����Ʈ ���·� ���
		System.out.println(list);
		
		//�� ���׸� ���α׷����� �ϴ°�? Ÿ���� ������ ������ Object��
		ArrayList cart = new ArrayList();
		cart.add("grape");
		cart.add("egg");
		cart.add("coffee");
		
		String str2 = (String)list.get(1);
		System.out.println(str2);
		
	}

}
