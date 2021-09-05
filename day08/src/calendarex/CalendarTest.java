package calendarex;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.println("=== ��¥ �����ϱ� ===");
		System.out.println("������ ���� : " + today.get(Calendar.YEAR));
		System.out.println("��(0~11) : " + today.get(Calendar.MONTH));
		System.out.println("�� : " + today.get(Calendar.DATE));
		System.out.println("���� : " + today.get(Calendar.DAY_OF_WEEK));
		//1-��, 2-��, ... 6-��, 7-��
		
		System.out.println("=== �ð� �����ϱ� ===");
		System.out.println("�ð�(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("��(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("��(0~11) : " + today.get(Calendar.SECOND));
		System.out.println("����(0), ����(1) : " + today.get(Calendar.AM_PM));
		
		//���ݱ����� �ð� - 1970. 1. 1 �������� �и���(1/1000)�� ȯ�� - getTimeInMillis()
		System.out.println("=== ��������� �ð� ===");
		System.out.println(today.getTimeInMillis());
		System.out.println("�ʷ� ȯ�� : " + today.getTimeInMillis()/1000);
		System.out.println("�Ϸ� ȯ�� : " + today.getTimeInMillis()/(24*60*60*1000));
		
	}

}
