package array2d;

public class Array2dCalc {

	public static void main(String[] args) {
		int[][] nums = {
				{1, 2, 3, 4}, 
				{4, 5, 6}
			};
		int i, j;
		int sum = 0;
		double avg;
		int count = 0;  //�迭 ����� ���� ����
		
		//�ε���
		int x = nums[1][2];
		System.out.println(x);
		
		//��ü ���
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
		}
		System.out.println();
		
		//�հ�� ���
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
				count++;  //���� 1����
			}
		}
		avg = (double)sum / count;
		System.out.println("�հ� : " + sum);
		//System.out.println("��� : " + avg);
		System.out.printf("��� : %.2f", avg);
		//���� ���� : %d - ����,  %f - �Ǽ�, %s - ����
		
	}

}
