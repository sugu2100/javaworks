package interfaceex.shelf;

public class Main {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		//å �߰�
		shelfQueue.enQueue("�ڹ� ���α׷���"); //0
		shelfQueue.enQueue("������ ��Ʈ");    //1
 		shelfQueue.enQueue("�ȵ���̵� ���α׷���"); //2
		
		//å�� ����
		System.out.println(shelfQueue.getSize() + "��");
		
		//å ���
		System.out.println(shelfQueue.deQueue()); //0
		System.out.println(shelfQueue.deQueue()); //1
	}

}
