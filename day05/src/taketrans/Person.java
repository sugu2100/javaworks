package taketrans;

public class Person {
	String name;
	int age;
	int money;    //���� ��
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//������ Ÿ��
	public void takeBus(Bus bus) {  //������ Ŭ������ �Ű������� ���
		bus.take(1200);
		this.money -= 1200;
	}
	
	//���� ���
	public void showInfo() {
		System.out.println(name + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}
