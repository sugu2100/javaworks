package exercise;

public class NumberArray {

	public static void main(String[] args) {
		// �迭�� ���̰� 5�� ������ �迭 ����
		//int[] numbers = new int[5];
		int sum = 0;
		
		//¦�� ����
		/*numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6;
		numbers[3] = 8;
		numbers[4] = 10;*/
		
		int[] numbers = {2, 4, 6, 8, 10};
		
		//�հ� ���
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("�հ� : " + sum);
	}

}
