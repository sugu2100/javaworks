package thread;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		//main �����常 ���� - ���������� ����

		//"��" �Ҹ��� 5�� ����ϱ�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//"��" ���ڸ� 5�� ����ϱ� -> 1�� ��������
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
