package innerclass;

public class StudentTest {

	public static void main(String[] args) {
		Student std = new Student("����");
		
		Student.Score score = std.new Score();
		
		score.eng = 80;
		score.math = 90;
		score.showInfo();
	}

}
