package classpart;

public class Number2 {
	
	int x;
	
	public Number2(int y) { //�Ű����� ���� ��������� ����
		x = y;
		System.out.println("�Ű����� ���� ��������� �����մϴ�.");
	}

	public static void main(String[] args) {
		// Number2 ���
		Number2 num1 = new Number2(5);
		Number2 num2 = new Number2(-12);
		
		System.out.println("x = " + num1.x);
		System.out.println("x = " + num2.x);
	}

}
