package ifexamples;

public class EvenOddIF {

	public static void main(String[] args) {
		// Ȧ��,¦�� �Ǻ� ���α׷�
		
		int num = 8;
		
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else { // num%2==1 ������
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println("���ڴ� " + num + "�Դϴ�.");
	}
}
