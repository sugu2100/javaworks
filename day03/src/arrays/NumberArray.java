package arrays;

public class NumberArray {

	public static void main(String[] args) {
		// �迭 ����
		// ������ numbers �̸��� �迭 ����(ũ��) 3�� ����
		int[] numbers = new int[3];
		int sum = 0;
		
		System.out.println("�迭�� ����: " + numbers.length);
		
		//���� ���� - ����
		//�ڷ����� �ʱⰪ - ��ü(null), ����(0), ����("")
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		//numbers[3] = 40;
		
		//���(��ȸ)
		System.out.println("numbers[0]=" + numbers[0]);
		System.out.println("numbers[1]=" + numbers[1]);
		System.out.println("numbers[2]=" + numbers[2]);

		//�迭�� for���� �����ؼ� ���
		for(int i=0; i<numbers.length; i++) { //0, 1, 2
			sum += numbers[i];
			System.out.println(numbers[i]);
		}
		System.out.println("�հ� : " + sum);
	}

}
