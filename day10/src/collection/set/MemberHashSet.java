package collection.set;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	//ȸ�� �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//ȸ�� ���
	public void showAllMember() {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) { //�ڷᰡ ������
			Member member = ir.next(); //�ڷḦ �����ͼ�
			System.out.println(member);
		}
	}
	
	//ȸ�� ����
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) { //�ݺ��ϸ鼭 �ڷᰡ ������
			Member member = ir.next();  //�ڷḦ ��������
			int dbId = member.getMemberId();  //������ ����� memberId�� ���
			if(dbId == memberId) {  //��û�ϴ� ���� Id�� ��
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
}








