package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest2 {

	public static void main(String[] args) {
		//정수형 배열
		int[] num = {1, 2, 3, 4};
		/* int sumVal = 0;
		 * for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sumVal += num[i]
		}*/
		
		//stream 생성후 1번 사용하면 소모 - Consumer
		IntStream stream = Arrays.stream(num);
		stream.forEach(n -> System.out.println(n));
		
		//합계와 평균, 새로운 stream 생성
		stream = Arrays.stream(num);
		int sumVal = stream.sum();  //사용하고 소모
		
		//새로운 stream 생성
		int count = (int)Arrays.stream(num).count();
		//평균
		double avg = (double)sumVal / count;
		
		System.out.println("합계 : " + sumVal);
		System.out.println("개수 : " + count);
		System.out.println("평균 : " + avg);
	}
}
