package exercise;

public class Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '%';   //operator == '+'
		int result = 0;
		
		//String operator = "+";  //operator.equals('+')
		
		//if ~else if �ڵ�
		if(operator=='+') {
			result = num1 + num2;
		}else if(operator=='-') {
			result = num1 - num2;
		}else if(operator=='*') {
			result = num1 * num2;
		}else if(operator=='/') {
			result = num1 / num2;
		}else {
			System.out.println("������ �����Դϴ�.");
			return;   //������ ����
		}

		System.out.println("��� ���� " + result + "�Դϴ�.");
	}
}
