package vartype;

public class CharType {

	public static void main(String[] args) {
		/*
		 * ���� �ڷ��� - char, String
		 char�� 2����Ʈ (-32,768 ~ 32,767) */
		char ch1 = 'A';
		char ch2 = 66;
		
		System.out.println(ch1);  //A
		System.out.println(ch2);  //B
		
		//'A'�� �ƽ�Ű�ڵ� 
		System.out.println((int)ch1); //65
		System.out.println((int)ch2); //66
		
		//'��'�� �����ڵ�
		char ch3 = '��';
		char ch4 = '\uD55C';  //�����ڵ� 16����
		char ch5 = '��';
		char ch6 = '\uAE00';
		
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);

	}

}
