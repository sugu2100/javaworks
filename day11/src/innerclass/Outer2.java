package innerclass;

public class Outer2 {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runner = new Runnable() {  //�̸����� ���� Ŭ������
		//�͸� ��ü runner
		@Override
		public void run() {
			System.out.println(outNum + " : �ܺ� Ŭ������ �ν��Ͻ� ����");
			System.out.println(sNum + " : �ܺ� Ŭ������ ���� ����");	
		}
	};//�����ݷ��� �ٿ��� run() ���� ����
}
