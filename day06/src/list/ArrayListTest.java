package list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList �迭 �����ϱ�
		ArrayList<String> cart = new ArrayList<>();
		
		//��ٱ��� ��ǰ �߰�
		cart.add("��");
		cart.add("���");
		cart.add("Ŀ��");
		cart.add("����");
		
		//ArrayList�� ����
		System.out.println("��ٱ��� ǰ�� : " + cart.size() + "��");
		
		//���
		for(int i = 0; i < cart.size(); i++) {
			String c = cart.get(i);
			System.out.println(c);
		}
		
		//���� - �� ����
		cart.remove(0);  //remove(index)
		
		//��� for
		for(String c : cart)
			System.out.println(c);
		
	}

}
