package operator;

public class CalcScores {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 75;
		
		int totalScore = mathScore + engScore;
		//double averageScore = totalScore / 2.0;
		double averageScore = (double)totalScore / 2;
		//���� ����ȯ
		
		System.out.println(totalScore);
		System.out.println(averageScore);
		
		//����, ���� ������ ++ / --
		int num = 10;
		//System.out.println(num++); //10
		//System.out.println(num); //11
		
		//��ġ ����
		System.out.println(++num); //11
		System.out.println(num);
		// num++ => num += 1, num = num + 1
		// num-- => num -= 1, num = num - 1
		
		System.out.println("====��� ����=====");
		//��� ����
		int n1 = 10;
		int n2 = 4;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
	}
}
