package forexample;

public class For1to10 {

	public static void main(String[] args) {
		// for �ݺ��� - 1���� 10���� ���
		int i;
		int sum = 0;
		for(i=1; i<=10; i+=2) {
			sum += i;
			System.out.println("i=" + i + ", sum=" + sum);
		}
		System.out.println("sum=" + sum);
	}

}
