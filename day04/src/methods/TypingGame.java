package methods;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		//�ܾ� �迭�� ����
		String[] word = {"river", "mountain", "sky", "tree", "flower",
				    "dog", "horse", "cow", "garlic", "onion"};		
		int n = 1;  //���� ��ȣ
		Scanner scan = new Scanner(System.in);
		long start, end;
		
		//���� Ÿ�ڰ��� ȭ��
		System.out.println("���� Ÿ�� ����, �غ�Ǹ� ����");
		scan.nextLine();
		start = System.currentTimeMillis();
		// Ÿ�� ���� ����
		while(n < 3) {
			System.out.println("����" + n);
			int rand = (int)(Math.random()*word.length);
			String q = word[rand];  //���� �ܾ� ����
			System.out.println(q);
			
			String ans = scan.nextLine();  //���� �Է�
			if(ans.equals(q)) { //�ܾ ��ġ�ϸ�(�����϶�)
				System.out.println("���!");
				n++;   //�� ���� �߰�
			}
			else {
				System.out.println("��Ÿ! �ٽ� ����!");
			}
		}
		end = System.currentTimeMillis();
		System.out.println("���� �ҿ� �ð��� " + (float)(end-start)/1000 + "���Դϴ�.");
		
		scan.close();
	}

}
