package innerclass;

public class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {  //���� ���� Ŭ����
		int num = 10;  //�������̽����� ������ final ����� �ٲ�
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				//num = 20;  ����̹Ƿ� ������ �� ����
				System.out.println(outNum + " : �ܺ� Ŭ������ �ν��Ͻ� ����");
				System.out.println(sNum + " : �ܺ� Ŭ������ ���� ����");
				System.out.println(localNum + " : ���� Ŭ������ �ν��Ͻ� ����");
			}
		}
		MyRunnable myRun = new MyRunnable();
		return myRun;
	}
}
