package methods;

public class ParamArray {

	//�հ踦 ����ϴ� �޼��� ����(�Ű������� �迭)
	public static int add(int[] score) {
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		//add �޼��� ȣ��
		int result = add(nums);
		double avg = (double)result / nums.length;
		
		System.out.println("�հ�: " + result);
		System.out.println("���: " + avg);

	}
}
