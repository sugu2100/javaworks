package switchcase;

public class SwitchEx {

	public static void main(String[] args) {
		// ���ǹ�: switch ~ case �� ����ϱ�
		// �񱳹����� �ִ� ���� if���� ����ϴ� ���� ����.
		// ������ ���� �޴� ���� �����ϱ�
		int rank = 3;
		String medalColor = "";
		
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			medalColor = "None";
			break;
		}
		System.out.println("�޴� ������ " + medalColor + "�Դϴ�.");
		

		/*
		if(rank==1) {
			medalColor = "Gold";
		}else if(rank==2) {
			medalColor = "Silver";
		}else if(rank==3) {
			medalColor = "Bronze";
		}else {
			medalColor = "None";
			System.out.println("�޴��� �����ϴ�.");
		}
		System.out.println("�޴� ������ " + medalColor + "�Դϴ�.");
		*/
		
	}
}
