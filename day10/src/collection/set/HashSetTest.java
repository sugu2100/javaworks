package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		//�θ� �������̽� set�� String type�� �ڷ��� ���
		Set<String> set = new HashSet();
		
		//�ڷ� �߰�
		set.add("��");
		set.add("��");
		set.add("���");
		set.add("��");  //�ߺ� �Ұ�
		set.add("����"); 
		
		//�ڷ��� ����
		System.out.println("�� ��ü�� : " + set.size());
		
		//��� - ����Ʈ ����
		System.out.println(set);
		
		//�� ���� - ��� : ������ ������ ����.
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) { //�ݺ��ϸ鼭 �ڷᰡ ������
			String fruit = ir.next(); //�ڷḦ ������
			System.out.println(fruit);
		}
	}
}
