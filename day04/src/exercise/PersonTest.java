package exercise;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();  // �⺻�����ڷ� p1 �ν��Ͻ� ����
		p1.age = 40;
		p1.name = "James";
		
		Person p2 = new Person(20, "������");
		
		p1.showInfo();
		p2.showInfo();
		
		/*
		System.out.println("���� : " + p1.age);
		System.out.println("�̸� : " + p1.name);
		System.out.println("��ȥ���� : " + p1.isMerried);
		System.out.println("�ڳ�� : " + p1.numberOfChild);
		*/

	}

}
