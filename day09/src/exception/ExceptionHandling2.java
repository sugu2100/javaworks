package exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// ���� try ~ catch��
		try {
			String name = null;
			int num1 = 10, num2 = 0;
			
			int num3 = num1 / num2;
			System.out.println(num3);
			
			System.out.println(name.toString());
			//null ��ü�� �����ؼ� ���� �߻� - ���� ����(Runtime Error)
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
