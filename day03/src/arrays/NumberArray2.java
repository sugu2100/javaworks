package arrays;

public class NumberArray2 {

	public static void main(String[] args) {
		// �迭�� ����� ��� - �߰�ȣ ���ȿ� �ʱ�ȭ ��
		int[] arr = {1, 2, 3, 4};
		int i;
		int sum = 0;
		double avg = 0.0;
		
		//�迭�� ũ��
		System.out.println(arr.length);
		
		//arr[2]�� �� ���
		System.out.println(arr[2]);
		
		//arr[2] ���� ����(����)
		arr[2] = 6;
		System.out.println(arr[2]);
		
		//��ü ���
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//�հ�
		for(i=0; i<arr.length; i++) {
			sum += arr[i];  //sum = sum + arr[i]
		}
		System.out.println("�հ�: " + sum);
		
		//���
		avg = (double)sum / arr.length;  //��� = �հ� / ���� : �ݵ�� ����ȯ
		System.out.println("���: " + avg);

	}

}
