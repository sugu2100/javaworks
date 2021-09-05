package scoremanage.scorelist;

import java.util.ArrayList;

import scoremanage.score.Subject;

public class Student {
	int id;
	String stdName;
	ArrayList<Subject> subjectList;
	
	public Student(int id, String stdName) {
		this.id = id;
		this.stdName = stdName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //���� ��ü ����
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);  //���� ��ü �߰�
	}
	
	public void showInfo() {
		//������ ��� ���
		int sum = 0;
		double avg = 0.0;
		for(Subject subject : subjectList) {
			sum += subject.getScorePoint();
			System.out.printf("�л� %s�� %s ���� ������ %d���Դϴ�.\n", 
					stdName, subject.getSubjectName(), subject.getScorePoint());
		}
		avg = (double)sum / subjectList.size();
		System.out.printf("�л� %s�� ������ %d���̰�, ����� %.2f���Դϴ�.\n", stdName, sum, avg);
	}
	
}
