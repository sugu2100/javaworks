package staticsample;

public class StudentTest {

	public static void main(String[] args) {
		//�ν��Ͻ� ����
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//�̸� �Է�
		s1.setName("�̴���");
		s2.setName("��α�");
		s3.setName("�縸��");
		
		//���
		System.out.println(s1.getName() + " �й� : " + s1.getId());
		System.out.println(s2.getName() + " �й� : " + s2.getId());
		System.out.println(s3.getName() + " �й� : " + s3.getId());
	}

}
