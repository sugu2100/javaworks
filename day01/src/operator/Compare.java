package operator;

public class Compare {

	public static void main(String[] args) {
		// �� ������
		int n1 = 7;
		int n2 = 3;
		boolean result1, result2, result3;
		/*
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);*/
		
		//�� ������
		// boolean �ڷ����� true/false�� ���� ����
		// &&-���� ������, ||-���� ������, !-������ ������
		result1 = (n1 < n2) && (n1 != n2);
		System.out.println(result1);
		
		result2 = (n1 < n2) || (n1 != n2);
		System.out.println(result2);
		
		result3 = !(n1 < n2);
		System.out.println(result3);
		
		
		//���̸� ���ؼ� boolean ������ �����ϱ�
		/*int myAge = 27;
		boolean value = myAge > 25;    //true
		System.out.println(value);*/
	}

}
