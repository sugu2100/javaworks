package forfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// �¼� ��ġ��
		/*int i, j;
		for(i=0; i<5; i++) {
			for(j=1; j<=5; j++) {
				int inc = i*5+j;
				System.out.print("�¼�" + inc + " ");
			}
			System.out.println();
		}*/
		
		Scanner sc = new Scanner(System.in);
		int i, j;
		
		System.out.print("���尴 �� �Է� : ");
		int customNum = sc.nextInt();
		
		System.out.print("�¼� �� �� �Է� : ");
		int colNum = sc.nextInt();
		
		int rowNum;
		if(customNum % colNum == 0) {
			rowNum = customNum / colNum;
		}else {  //�������� ������ 1���� �� �ʿ���
			rowNum = customNum / colNum + 1;
		}
		
		for(i=0; i<rowNum; i++) {
			for(j=1; j<=colNum; j++) {
				int seats = i*colNum+j;
				System.out.print("�¼�" + seats + " ");
				if(seats == customNum)
					break;
			}
			System.out.println();
		}
		
		sc.close();
	}
}
