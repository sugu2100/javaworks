package whileexample;

public class WhileSum2 {

	public static void main(String[] args) {
		// 1���� 10���� �հ� ���ϱ�
		// break�� ��� -> �ݺ� ���ǹ�
		
		int n = 1;
		int sum = 0;
		
		while(true) {  //�ݺ� ���ǹ�
			sum += n;
			System.out.println("n=" + n + ", sum=" + sum);
			n++;
			if(n > 10)
				break;
		}
		System.out.println("1���� 10������ ��: " + sum);	
	}

}
