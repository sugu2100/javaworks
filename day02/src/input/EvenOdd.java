package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// ¦��/Ȧ�� �Ǻ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		String result = "";
		
		result = (num % 2 == 0) ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		//���� ������
		/*
		if(num % 2 == 1) {
			result = "Ȧ���Դϴ�.";
		}else {
			result = "¦���Դϴ�.";
		}*/
		
		System.out.println(result);
		sc.close();
	}
}
