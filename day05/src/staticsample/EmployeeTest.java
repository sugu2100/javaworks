package staticsample;

public class EmployeeTest {

	public static void main(String[] args) {
		//��� ��ȣ ����, static ������ ����ϸ� Ŭ���� �̸����� ���� ����
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		//ù��° ���
		e1.setName("�̴���");
		//e1.serialNum++;  //1����
		Employee.serialNum++;
		System.out.println("��� : " + Employee.serialNum); //1001
		
		//�ι�° ���
		e2.setName("��α�");
		//e2.serialNum++;     ���� ��� ����
		Employee.serialNum++;
		System.out.println("��� : " + Employee.serialNum);
		
		//����° ���
		e3.setName("�縸��");
		Employee.serialNum++;
		System.out.println("��� : " + Employee.serialNum);
	}

}
