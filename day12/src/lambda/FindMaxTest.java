package lambda;

public class FindMaxTest {

	public static void main(String[] args) {
		FindMax num;
		//�� ���� �ִ밪 ���
		num = (x, y) -> {
			return (x >= y) ? x : y;
		};
		System.out.println(num.getMax(10, 20));
		
		//{}, return ���� ����
		num = (x, y) -> (x >= y) ? x : y;
		System.out.println("�� ���� ū ���� " + num.getMax(10, 20));

	}

}
