package exercise;

public class Person {
	int age;           //����
	String name;       //�̸�

	public Person() {}   //�⺻ �������ε� �ٸ� �����ڰ� ������ �����Ұ�
	
	public Person(int age, String name) { //���̿� �̸��� �Ű������� ������
		this.age = age;
		this.name = name;
	}
	
	//���� �޼���
	public void showInfo() {
		System.out.println("���� : " + age);
		System.out.println("�̸� : " + name);

	}
}
