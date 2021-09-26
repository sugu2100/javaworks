package thread;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		//main 스레드만 실행 - 순차적으로 실행

		//"띵" 소리를 5번 재생하기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//"띵" 문자를 5번 출력하기 -> 1초 간격으로
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
