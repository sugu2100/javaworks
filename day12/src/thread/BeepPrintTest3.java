package thread;

import java.awt.Toolkit;

public class BeepPrintTest3 {

	public static void main(String[] args) {
		//���ν������ �۾� �����尡 ���ÿ� ���� 
		//Thread Ŭ������ �����ڷ� ���ٽ� �����
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
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
