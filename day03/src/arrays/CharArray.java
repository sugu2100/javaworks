package arrays;

public class CharArray {

	public static void main(String[] args) {
		// ���ڿ� �迭 ���� �� ���
		//String[] cars = new String[4];
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		//�ε��� - "K7"
		System.out.println(cars[3]);
		
		//"Morning"�� "BMW"�� ����
		cars[0] = "BMW";
		System.out.println(cars[0]);
		
		//��ü ���
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		
		System.out.println("==��� for��==");
		for(String car : cars) { //�ڷ��� ���� : �迭�̸�
			System.out.print(car + " ");
		}
		System.out.println();
		
		//���ĺ� �빮�� �迭�� ����
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//alphabets[0] = ch;
		//ch++;
		
		//System.out.println(alphabets[0]);
		//System.out.println(ch);
		
		//�迭�� ���ĺ��� ����
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		//���ĺ� ���
		for(int i=0; i<alphabets.length; i++) {
			System.out.println((int)alphabets[i] + ", " + alphabets[i]);
		}

	}

}
