package methods;

public class MathEx {

	public static void main(String[] args) {
		// Math Ŭ������ ���� �޼��� ���
		// ���밪 
		int v1 = Math.abs(-10);
		System.out.println("v1 = " + v1);
		
		// �ݿø�
		long v2 = Math.round(5.67);
		System.out.println("v2 = " + v2);
		
		// ����
		double v3 = Math.floor(2.54);
		System.out.println("v3 = " + v3);
		
		// �ִ밪
		int max = Math.max(10, 30);
		System.out.println("max = " + max);
		
		// ����(������ ��) , ����: 0 ũ�ų� ���� 1���� �۴�.
		double rand = Math.random();
		System.out.println("rand = " + rand);
		
		// �ֻ��� ��
		int dice = (int)(Math.random()*6) + 1;
		System.out.println(dice);
		
		//�ֻ��� 10�� ������
		for(int i=1; i<11; i++) {
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.println(dice2);
		}
		
		//���ڸ� �����ϰ� �̾Ƴ���
		String[] word = {"��", "��", "�츮"};
		int r = (int)(Math.random()*word.length);
		System.out.println(r);
		System.out.println(word[r]);
		
		
		/*for(String w : word) {
			System.out.println(w);
		}*/
		
		//�ð� ����
		long now = System.currentTimeMillis();
		System.out.println(now/1000);
		//�ð� - 1970. 1.1 �������� ~ ����(�ʷ� ȯ��)

	}

}
