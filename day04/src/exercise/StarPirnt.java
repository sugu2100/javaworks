package exercise;

public class StarPirnt {

	public static void main(String[] args) {
		// ���� Ȱ���Ͽ� �ﰢ�� ����� �� ���
		int i, j;
		int row = 5;   //�� ��
		int star = 1;  //���� ����
		
		for(i=1; i<=row; i++) {
			for(j=1; j<star+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(row);
		System.out.println(star);
		/*
		     *
		    **
		   ***
		  ****
		 *****
		 */
		
		for(i=1; i<=5; i++) {
			//���鹮�� ǥ��
			for(j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			//�� ǥ��
			for(j=1; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//���� Ȱ�� �ﰢ�� ��� ���
		row = 4;
		star = 1;
		int space = row-1;
		
		for(i=1; i<=row; i++) {
			for(j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=star; j++) {
				System.out.print("*");
			}
			if(i<=row) {
				space -= 1;   //���鹮�� 1���� ����
				star += 2;    //������ 2���� ����
			}
			System.out.println();
		}
	}
}
