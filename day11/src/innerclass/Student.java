package innerclass;

public class Student {
	private String name;
	
	public Student(String name) {
		this.name = name;
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
}
