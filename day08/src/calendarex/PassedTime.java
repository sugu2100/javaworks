package calendarex;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		//������ ~ ������ ��¥ ���
		Calendar day1 = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		//������ ����, ���� 1�� ���� ����
		day1.set(2021, 7, 14);
		
		//��¥ ���
		String startDay = day1.get(Calendar.YEAR) + "�� " 
		      + (day1.get(Calendar.MONTH) + 1) + "�� " + day1.get(Calendar.DATE) + "��";
		
		String Today = today.get(Calendar.YEAR) + "�� " 
			      + (today.get(Calendar.MONTH) + 1) + "�� " + today.get(Calendar.DATE) + "��";
		
		System.out.println("������ : " + startDay);
		System.out.println("���� : " + Today);
		
		//��¥ ���
		long passedTime = today.getTimeInMillis() - day1.getTimeInMillis(); //�и���
		//�Ϸ� ȯ��
		passedTime = passedTime / (24*60*60*1000);
		System.out.println("�� ���ñ��� �� ��? ��");
		System.out.println("���� ���� " + passedTime + "���� �������ϴ�.");
	}

}
