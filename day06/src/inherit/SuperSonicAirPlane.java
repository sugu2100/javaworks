package inherit;

public class SuperSonicAirPlane extends AirPlane{
	//������ ������� ��� - �Ϲݸ��, ������ ���
	static final int NORMAL = 1;   //��� ǥ��
	static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	@Override   //�ֳ����̼� ǥ�� -> �޼��� ������(�������̵�)
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		}else {//�θ� �޼��� ����Ҷ��� super�� ����
			super.fly();  //�Ϲ� �����մϴ�.
			//System.out.println("�Ϲ� �����մϴ�.");
		}	
	}
}
