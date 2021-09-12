package collection.list;

import java.util.ArrayList;

import collection.Member;

//ȸ�� ���� Ŭ���� - �߰�, ��ȸ, ���� 
public class MemberArrayList {
	//ArrayList�� Member type �ڷ��� ���
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//ȸ�� �߰�
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//ȸ�� ���
	public void showAllMember() {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//ȸ�� ����
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);  //memberId, MemberName�� ���Ե� ��ü
			int dbMemberId = member.getMemberId(); //�̹� ����� memberId�� ������
			if(dbMemberId == memberId) { //�ܺο��� �Է��� memberId�� ���ٸ�
				arrayList.remove(i);
				return true;
			}
			
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
}





