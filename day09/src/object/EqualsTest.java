package object;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("����");
		String name2 = new String("����");
		
		//�޸� �ּ� ��
		System.out.println(name1 == name2);
		//���� �� ��
		System.out.println(name1.equals(name2));
		
		//Book ��ü ��
		Book book1 = new Book(101, "����");
		Book book2 = new Book(101, "����");
		//�޸� �ּ� �ٸ���.
		System.out.println(book1 == book2);
		//���尪 �� - true�� �Ǿ����.
		System.out.println(book1.equals(book2));
		
	}

}
