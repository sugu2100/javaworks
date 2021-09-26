package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("����", 90),
				new Student("����", 80),
				new Student("��û", 70)
		);
		
		//Ŭ�����κ� ��Ʈ�� ���  - stream ����ϸ� �Ҹ�
		Stream<Student> stream = list.stream();
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name + ", " + score);
		});
		
		//map() �Լ��� �л��� �̸��� ���, ���� ��Ʈ�� ����
		stream = list.stream();
		stream.map(student -> student.getName())
		      .forEach(student -> System.out.println(student));
		
		//��ü �л��� ������ ���
		stream = list.stream();
		stream.mapToInt(s -> s.getScore()).forEach(s -> System.out.println(s));
		
		//������ 80�̻��� �л��� �̸� ���
		stream = list.stream();
		stream.filter(s -> s.getScore() >= 80).map(s -> s.getName())
			  .forEach(s -> System.out.println(s));
		
	}

}
