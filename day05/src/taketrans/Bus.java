package taketrans;

public class Bus {
	int busNumber;    //���� ��ȣ
	int passenger;    //�°�
	int money;        //����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//����� �¿��
	public void take(int money) {
		this.money += money;  //��� ����
		passenger++;          //�°��� 1 ����
	}
	
	//���� ���
	public void showInfo() {
		System.out.println(busNumber + "�� ������ ������ " + money 
				+ "�� �̰�, �°����� " + passenger + "�� �Դϴ�.");
	}
	
}
