package array2d;

public class Score2dArray {

	public static void main(String[] args) {
		// �л� 5���� ����� ���� ���� ���
		int[][] score = {
				{91, 70},
				{80, 50},
				{75, 62},
				{93, 85},
				{80, 70}
		};
		int i, j;
		int[] sum = {0, 0};  //����, ����
		double[] avg = {0.0, 0.0};
		
		//���
		System.out.println("���� ����");
		for(i = 0; i < score.length; i++) {
			for(j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "  ");
			}
			System.out.println();
		}
		
		//�հ�� ���
		for(i = 0; i < score.length; i++) {
			sum[0] += score[i][0];
			sum[1] += score[i][1];
		}
		avg[0] = (double)sum[0] / score.length;  //���� ���
		avg[1] = (double)sum[1] / score.length;  //���� ���
		
		System.out.println("���� �հ� : " + sum[0]);
		System.out.println("���� �հ� : " + sum[1]);
		System.out.println("���� ��� : " + avg[0]);
		System.out.println("���� ��� : " + avg[1]);
	}
}
