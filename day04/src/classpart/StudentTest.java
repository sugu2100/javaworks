package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// �л� Ŭ���� ���
		Student s1 = new Student();
		//Ŭ����  �ν��Ͻ����� = new ������
		//s1.studentName = "�̸���"; ���������ڰ� private�̹Ƿ� �Ұ�
		s1.setStudentName("�̸���");
		//s1.grade = 3;
		s1.setGrade(3);
		
		Student s2 = new Student();
		//s2.studentName = "������";
		s2.setStudentName("������");
		//s2.grade = 1;
		s2.setGrade(1);
		
		Student s3 = new Student("ȫ�浿");
		//s3.grade = 2;
		s3.setGrade(2);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		
		//s1 ��ü�� ���
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		/*
		System.out.println("�л� �̸� : " + s1.studentName);
		System.out.println("�г� : " + s1.grade);
		System.out.println("�л� �̸� : " + s2.studentName);
		System.out.println("�г� : " + s2.grade);
		*/

	}

}
