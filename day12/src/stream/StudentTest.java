package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("콩쥐", 90),
				new Student("팥쥐", 80),
				new Student("심청", 70)
		);
		
		//클래스로부 스트림 얻기  - stream 사용하면 소모
		Stream<Student> stream = list.stream();
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name + ", " + score);
		});
		
		//map() 함수로 학생의 이름만 출력, 새로 스트림 생성
		stream = list.stream();
		stream.map(student -> student.getName())
		      .forEach(student -> System.out.println(student));
		
		//전체 학생의 점수만 출력
		stream = list.stream();
		stream.mapToInt(s -> s.getScore()).forEach(s -> System.out.println(s));
		
		//점수가 80이상인 학생의 이름 출력
		stream = list.stream();
		stream.filter(s -> s.getScore() >= 80).map(s -> s.getName())
			  .forEach(s -> System.out.println(s));
		
	}

}
