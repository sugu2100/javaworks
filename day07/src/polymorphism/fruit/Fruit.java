package polymorphism.fruit;

public class Fruit {
	String name;    //���� �̸�
	String weight;  //�߷�
	int price;      //����
	
	public Fruit() {}
	
	public void showInfo() {
		System.out.println("���� �̸� : " + name);
		System.out.println("���� ���� : " + weight);
		System.out.println("���� ���� : " + price);
	}
}
