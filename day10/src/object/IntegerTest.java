package object;

import java.util.ArrayList;

public class IntegerTest {

	public static void main(String[] args) {
		//Integer num1 = new Integer(100);
		Integer num1 = 100;  //Integer > int (����ڽ�)
		int num2 = 200;
		int sum = num1 + num2;  
		//num1 - ��ڽ�(Integer -> int��)
		System.out.println(num1);
		System.out.println(sum);
		
		//valueOf() -> ������ ���ڿ��� Integer Ŭ������ ��ȯ
		Integer n1 = Integer.valueOf("200");
		System.out.println(n1);
		
		//parseInt() -> ���ڿ��� ���ڷ� ������
		int n2 = Integer.parseInt("300");
		System.out.println(n2);
		
		//ArrayList�� Integer Ÿ���� �ڷḦ ����
		ArrayList<Integer> numList = new ArrayList<>();
		
		//�ڷ� �߰�
		numList.add(1);
		numList.add(4);
		numList.add(8);
		
		//���
		for(Integer num : numList)
			System.out.println(num);
		
	}

}








