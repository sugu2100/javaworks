package classpart;

public class Number {
	
	int x;
	
	public Number() {  //������ - Ŭ���� �̸��� ����, ���´� �Լ���(�޼���), return�� ����
		x = 10;
		System.out.println("�ʱⰪ�� �����մϴ�.");
	}
	

	public static void main(String[] args) {
		// ������ �˾ƺ���
		Number myNumber = new Number();
		
		System.out.println(myNumber.x);

	}

}
