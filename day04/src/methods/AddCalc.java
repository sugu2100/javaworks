package methods;

public class AddCalc {

	public static void main(String[] args) {
		// ���ϱ� �Լ� ȣ��
		int result = add(20, -20);
		System.out.println("��� ���� " + result);

	}
	
	public static int add(int n1, int n2) {  //�Ű������� 2��
		int sum = n1 + n2;
		return sum;
	}

}
