package innerclass;

public class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {  //���� ���� Ŭ����
		
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				System.out.println(outNum + " : �ܺ� Ŭ������ �ν��Ͻ� ����");
				System.out.println(sNum + " : �ܺ� Ŭ������ ���� ����");
				System.out.println(localNum + " : ���� Ŭ������ �ν��Ͻ� ����");
			}
		}
		MyRunnable myRun = new MyRunnable();
		return myRun;
	}
}
