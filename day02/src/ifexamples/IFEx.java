package ifexamples;

public class IFEx {

	public static void main(String[] args) {
		// ���ǹ� ����ϱ� : if �ܵ� ���
		int age = 9;
		
		/*if(age >= 8) {
			System.out.println("�б��� ���ϴ�.");
		}*/
		
	
		// if ~ else��
		if(age < 8) {
			System.out.println("�б��� ���� �ʽ��ϴ�.");
		}
		else {  //(age >= 8) ������
			System.out.println("�б��� ���ϴ�.");
		}
		
		System.out.println("���̴� " + age + "�� �Դϴ�.");
	}
}
