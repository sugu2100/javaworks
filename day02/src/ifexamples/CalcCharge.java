package ifexamples;

public class CalcCharge {

	public static void main(String[] args) {
		// ���̰��� ����� ����ϱ� - �����оƵ�, �ʵ�, ��.���, �Ϲ���
		// ���� ����
		int age = 15;
		int charge = 0;
		
		// ���� ó��
		if(age < 8) {  //�� ������ ��� - boolean(true/false)
			System.out.println("������ �Ƶ��Դϴ�.");
			charge = 1000; 
		}else if(age >= 8 && age < 14) { // true && true
			System.out.println("�ʵ��л��Դϴ�.");
			charge = 2000;
		}else if(age >= 14 && age < 20) {
			System.out.println("��.����л� �Դϴ�.");
			charge = 2500;
		}else {  // age >= 20
			System.out.println("�Ϲ��� �Դϴ�.");
			charge = 3000;
		}
		System.out.println("������ " + charge + "���Դϴ�.");
	}
}
