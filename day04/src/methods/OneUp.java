package methods;

public class OneUp {
	
	//x �� �������� - �� ����� �Ҹ�
	public static int oneUp(int x) {
		x = x + 1;
		return x;
	}

	public static void main(String[] args) {
		// 1���� �Լ� ȣ��
		int num1 = oneUp(1);  //x�� 2�� ��ȯ�ϰ� x�޸� �Ҹ�
		num1 = oneUp(1);  //2
		num1 = oneUp(1);  //2
		System.out.println(num1);
		
		//x�� ��� - x�� ������ �ȵ�. undefined
		//System.out.println(x);

	}

}
