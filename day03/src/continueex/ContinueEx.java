package continueex;

public class ContinueEx {

	public static void main(String[] args) {
		// �ݺ��� - continue Ű���� ����ϱ�
		//1���� 10���� �� 4, 7�� ������ �� ���
		for(int i=1; i<=10; i++) {
			if(i==4 || i==7)
				continue;
			System.out.println(i);
		}
		
		//1���� 10�� Ȧ���� ���
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}

	}

}
