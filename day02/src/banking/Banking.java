package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// ���� ���� ���α׷�
		Scanner sc = new Scanner(System.in);
		boolean run = true;  //���α׷� ����� ���Ḧ �����ϴ� ����
		int balance = 0;  // �ʱ� �ܾ�
		
		while(run) {
			System.out.println("=============================");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("=============================");
			System.out.print("����>");
			
			int selNum = sc.nextInt();
			
			switch(selNum) {
			case 1:
				System.out.print("���ݾ�>");
				int money = sc.nextInt();
				balance += money;
				System.out.println("�Ա� ó�� �Ǿ����ϴ�.");
				break;
			case 2:
				while(true) {
					System.out.print("��ݾ�>");
					money = sc.nextInt();
					if(money > balance) {
						System.out.println("�ܾ��� �����մϴ�. �ٽ� �Է��� �ּ���");
					}else {
						balance -= money;
						System.out.println("��� ó�� �Ǿ����ϴ�.");
						break;
					}
				} //while �ݱ�
				break;
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("�޴��� �߸� �������ϴ�.");
				break;
			}
		}
		System.out.println("���α׷� ����.");
		sc.close();
	} //main() �ݱ�
}//class �ݱ�
