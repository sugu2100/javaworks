package vartype;

public class TypeConversion {

	public static void main(String[] args) {
		// �ڵ� ����ȯ : ū �ڷ��� = ���� �ڷ���
		int iNum = 20;
		float fNum = iNum;
		
		System.out.println(fNum);
		
		// ���� ����ȯ : ���� �ڷ��� = (�ڷ���)ū �ڷ���
		double dNum = 1.2;
		float fNum2 = 0.9F;
		
		int result1 = (int)dNum + (int)fNum2;
		int result2 = (int)(dNum + fNum2);
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
