package arraysample;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		//array1�� �ڷ� ����
		array1[0] = new Book("�ڹ����α׷��� �Թ�", "������");
		array1[1] = new Book("���� �� ���̽�", "������");
		array1[2] = new Book("õ���� �Ķ�", "õ����"); 
		
		//array2�� ����
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		System.out.println("=== array1 ��� ===");
		for(int i = 0; i < array1.length; i++) {
			array1[i].showInfo();
		}
		
		System.out.println("=== array2 ��� ===");
		for(int i = 0; i < array2.length; i++) {
			array2[i].showInfo();
		}
	}

}
