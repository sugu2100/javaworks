package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'�� ������ "��� �ݺ�", 'n' Ű�� "�ݺ� �ߴ�"
		// �� �̿��� Ű�� ������ "�������� �ʴ� ���"
		// equals()�� String Ŭ������ �Լ��̴�. ���ڿ��� ������ ���� �� ���
		Scanner sc = new Scanner(System.in);
		
		while(true) {  //���� �ݺ�
			System.out.print("��� �ݺ��ұ��?(y/n)");
			String key = sc.nextLine();
			if(key.equals("y") || key.equals("Y")) { //"==" ���� �񱳽� ���
				System.out.println("��� �ݺ��մϴ�.");
			}else if(key.equals("n") || key.equals("N")) {
				System.out.println("�ݺ��� �ߴ��մϴ�.");
				break;
			}else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}
}
