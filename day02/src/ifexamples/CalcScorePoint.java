package ifexamples;

import java.util.Scanner;

public class CalcScorePoint {

	public static void main(String[] args) {
		// ���� ��� ���α׷� �����
		Scanner sc = new Scanner(System.in);
		
		//int score = 85; 
		System.out.print("������ �Է��ϼ���: ");
		int score = sc.nextInt();
		
		char grade = ' '; //���� ���ڷ� �ʱ�ȭ
		//String str = "";
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score < 90 && score >= 80) {
			grade = 'B';
		}else if(score < 80 && score >= 70) {
			grade = 'C';
		}else if(score < 70 && score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade + "���� �Դϴ�.");
		sc.close();
	}

}
