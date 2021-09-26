package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest2 {

	public static void main(String[] args) {
		//������ �迭
		int[] num = {1, 2, 3, 4};
		/* int sumVal = 0;
		 * for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sumVal += num[i]
		}*/
		
		//stream ������ 1�� ����ϸ� �Ҹ� - Consumer
		IntStream stream = Arrays.stream(num);
		stream.forEach(n -> System.out.println(n));
		
		//�հ�� ���, ���ο� stream ����
		stream = Arrays.stream(num);
		int sumVal = stream.sum();  //����ϰ� �Ҹ�
		
		//���ο� stream ����
		int count = (int)Arrays.stream(num).count();
		//���
		double avg = (double)sumVal / count;
		
		System.out.println("�հ� : " + sumVal);
		System.out.println("���� : " + count);
		System.out.println("��� : " + avg);
	}
}
