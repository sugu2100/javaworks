package forfor;

public class StarPrint {

	public static void main(String[] args) {
		// �� ���
		/*for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("��");
			}
			System.out.println(); //�ٹٲ�
		}*/
		
		//�ﰢ�� ��� �� ���
		/*
		 *               *****
		 **              ****
		 ***             ***
		 ****            **  
		 *****           *
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(); //�ٹٲ�
		}
		System.out.println();
		
		//�� �����ﰢ��
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println(); //�ٹٲ�
		}
		
		
		
		
		
		
		
		
		
		
	}
}
