package scoremanage.scorelist;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(101, "���");
		Student s2 = new Student(101, "���");
				
		//����, ���� ����
		s1.addSubject("����", 95);
		s1.addSubject("����", 80);
		s1.addSubject("Java", 78);
		
		s2.addSubject("����", 90);
		s2.addSubject("����", 70);
		s2.addSubject("Java", 68);
		
		//���
		s1.showInfo();
		s2.showInfo();
	}

}
