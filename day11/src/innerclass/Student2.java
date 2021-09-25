package innerclass;

public class Student2 {
	private String name;
	private Score score;
	
	public Student2(String name) {
		this.name = name;
		score = new Score();
	}
	
	class Score {  //���� Ŭ����
		int eng;
		int math;
		
		public void showInfo() {
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + math);
		}
	}
	
	void usingClass() {
		score.eng = 90;
		score.math = 80;
		score.showInfo();
	}
}
