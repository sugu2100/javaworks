package taketrans;

public class TakeTrans {

	public static void main(String[] args) {
		// ����� ���� Ŭ���� ���
		Person p1 = new Person("�̰�", 10000);
		Person p2 = new Person("�ڼ�", 20000);
		
		Bus bus100 = new Bus(100);
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p1.showInfo();
		p2.showInfo();
		
		//������ ����
		bus100.showInfo();

	}

}
