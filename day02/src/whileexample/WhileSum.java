package whileexample;

public class WhileSum {

	public static void main(String[] args) {
		// 1���� 10���� �հ� ���ϱ�
		
		int num = 1;
		//num += 2;
		//num += 3;
		
		int sum = 0;  //�հ踦 ������ ����
		while(num <= 10) {
			sum += num;  //���� �հ�, sum = sum + num
			System.out.println("num=" + num + ", sum= " + sum);
			num++;
		}
		System.out.println("1���� 10������ ����" + sum +"�Դϴ�.");
		System.out.println("num=" + num);
	}

}
