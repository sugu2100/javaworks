package lambda;

public class FindMaxTest {

	public static void main(String[] args) {
		FindMax num;
		//두 수중 최대값 계산
		num = (x, y) -> {
			return (x >= y) ? x : y;
		};
		System.out.println(num.getMax(10, 20));
		
		//{}, return 생략 가능
		num = (x, y) -> (x >= y) ? x : y;
		System.out.println("두 수중 큰 수는 " + num.getMax(10, 20));

	}

}
