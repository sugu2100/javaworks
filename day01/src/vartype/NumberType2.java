package vartype;

public class NumberType2 {

	public static void main(String[] args) {
		// �Ǽ� �ڷ����� ũ�� �� ����
		//float�� 4����Ʈ ('F'�� 'f'�� �ٿ�����), double(�⺻)�� 8����Ʈ
		float fData = 2.54F;
		double dData = 3.1415;
		
		System.out.println(fData);
		System.out.println(dData);
		
		//���е� ����
		float fData2 = 0.12345678F; //�Ҽ� 8�ڸ����� ����
		double dData2 = 0.1234567890123456; //�Ҽ� 16�ڸ����� ����
		
		System.out.println(fData2);
		System.out.println(dData2);
		
	}

}
