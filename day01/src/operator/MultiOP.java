package operator;

public class MultiOP {

	public static void main(String[] args) {
		// ���� ���� ������
		int num = 10;
		
		System.out.println(num += 2);   //num = num + 2
		System.out.println(num %= 10);  //num = num % 10
		num -= 1;  //num = num - 1
		System.out.println(num);
		
		//���� ������
		//���ǽ� ? ���ΰ� : ������ ��
		
		boolean val = (5 < 3) ? true : false;
		System.out.println(val);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);

	}

}
