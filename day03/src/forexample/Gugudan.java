package forexample;

public class Gugudan {

	public static void main(String[] args) {
		// 4�� ��� - 1�� 1��
		int dan = 3;
		int i, j;
		for(i=1; i<10; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
		
		//��ü ������ - 9�� 1��(��ø for)
		for(i=2; i<10; i++) {
			System.out.println("==" + i +"��==");
			for(j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
		//¦���� ���
		/*for(i=2; i<10; i++) {
			if(i%2==0) {
				System.out.println("==" + i +"��==");
				for(j=1; j<10; j++) {
					System.out.println(i + "x" + j + "=" + (i*j));
				}
				System.out.println();
			}
		}*/
	}

}
