package list;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// ArrayList�� Book ��ü 3�� ����
		ArrayList<Book> list = new ArrayList<>();
		
		/*/book �ν��Ͻ� ����
		Book book1 = new Book("�ڹ� ���α׷���", "������");
		Book book2 = new Book("õ���� �Ķ�", "õ����");
		Book book3 = new Book("�¹���1", "������");
		
		//ArrayList�� ����
		list.add(book1);
		list.add(book2);
		list.add(book3);*/
		
		list.add(new Book("�ڹ� ���α׷���", "������"));
		list.add(new Book("õ���� �Ķ�", "õ����"));
		list.add(new Book("�¹���1", "������"));
		
		//��ȸ
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			book.showInfo();
		}

	}

}
