package constantEx;

public class ConstantEx {

	public static void main(String[] args) {
		// ��� �����ϰ� ����ϱ�
		final int MAX_NUM = 100;
		
		//MAX_NUM = 1000;  ����� ������ �� ����.
		
		System.out.println(MAX_NUM);
		
		//���� ���̸� ����ϴ� ���α׷� 
		// ���� ���� = pi * ������ * ������
		// ��� �� ���� ����
		final double PI = 3.14;
		int radius = 5;
		double area;
		
		//���
		area = PI * radius * radius;
		
		//���
		System.out.println(area);
	}
}
