package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� ��� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʷ� ���");
		System.out.println("L : ��Ⱑ ���� ���� �������� ���");
		System.out.println("P : �켱 ������ ���� �� ���� ���");
		
		try {
			int ch = System.in.read(); //���� �Է�
			
			Scheduler scheduler = null;
			if(ch == 'R' || ch == 'r') {
				scheduler = new RoundRobin();
			}else if(ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			}else if(ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			}else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
				//return;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}catch(NullPointerException e) {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}
