package operator;

public class Operator1 {

	public static void main(String[] args) {
		// ������ ��ȯ
		int x = 0;
		int y = 1;
		int temp;  //�ӽ÷� ������ ����
		
		System.out.println("=== ��ȯ�� ===");
		// '+' ���ڵ� ����, ���� ���ϱ�
		System.out.println("x=" + x + ", y=" + y);
		
		//��ȯ ó��
		//x���� temp�� ����
		temp = x;
		//y���� x�� ����
		x = y;
		//temp ���� y�� ����
		y = temp;
		
		System.out.println("=== ��ȯ�� ===");
		// '+' ���ڵ� ����, ���� ���ϱ�
		System.out.println("x=" + x + ", y=" + y);

	}

}
