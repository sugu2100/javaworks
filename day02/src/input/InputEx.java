package input;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		// �Է� ó��
		Scanner sc = new Scanner(System.in);
		// Ŭ���� ������Ʈ = new ������
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();  //nextLine()�� ���� �Է� �Լ�
		System.out.println("����� �̸��� " + name + "�̱���.");
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();  //nextInt() ���� �Է�
		System.out.println("����� ���̴� " + age + "�� �̱���.");
		
		sc.close();
	}
}
