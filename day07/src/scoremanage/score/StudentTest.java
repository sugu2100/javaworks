package scoremanage.score;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(101, "����");
		
		s1.koreanSubject("����", 91);
		s1.mathSubject("����", 83);
		
		
		s1.showInfo();
	}

}
