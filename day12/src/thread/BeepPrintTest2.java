package thread;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		//��Ƽ ������� �۵�
		Runnable beepTask = new BeepTask();
		//Thread Ŭ������ �����ڷ� beepTask�� ����
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
