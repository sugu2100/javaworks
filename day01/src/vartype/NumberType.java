package vartype;

public class NumberType {

	public static void main(String[] args) {
		//���� �ڷ����� ���� �� ũ��
		//byte �ڷ����� ũ��� 1Byte�̹Ƿ� ����(-128~ 127)
		byte bData1 = -128;
		//byte bData2 = 128; //���� �ʰ� ����
		
		//short �ڷ����� ũ��� 2Byte (-32,768 ~ 32,767)
		short sData1 = 32767;
		//short sData2 = 32768;
		
		System.out.println(bData1);
		System.out.println(sData1);
		
		//�⺻ �ڷ��� - int�� 4����Ʈ (�� ~21�� ~ 21��)
		int iNum = 1234567890;
		//int iNum2 = 12345678901;
		
		//long�� - ū ���� 8����Ʈ ('L'�̳� 'l'�� ���� ����)
		long lNum = 1234567890123L;
		System.out.println(iNum);
		System.out.println(lNum);
	}

}
