package forfor;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// ���尴 ���� ���� �¼� �ټ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���尴 �� �Է� : ");
		int customNum = sc.nextInt();
		
		System.out.print("�¼� �� �� �Է� : ");
		int colNum = sc.nextInt();
		
		int rowNum;
		if(customNum % colNum == 0) {
			rowNum = customNum / colNum;
		}else {
			rowNum = customNum / colNum + 1;
		}
		
		System.out.println(rowNum + "���� ���� �ʿ��մϴ�.");
		sc.close();
	}
}
