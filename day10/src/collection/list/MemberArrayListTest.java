package collection.list;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList mArrayList = new MemberArrayList();
		
		//Member ��ü ����
		Member m1 = new Member(101, "����");
		Member m2 = new Member(102, "����");
		Member m3 = new Member(103, "���");
		Member m4 = new Member(104, "���");
		Member m5 = new Member(101, "����");
		
		//ȸ�� �߰�
		mArrayList.addMember(m1);
		mArrayList.addMember(m2);
		mArrayList.addMember(m3);
		mArrayList.addMember(m4);
		mArrayList.addMember(m5);
		
		//ȸ�� ��ȸ
		mArrayList.showAllMember();
		System.out.println("========================");
		
		//ȸ�� ����
		mArrayList.removeMember(102);
		mArrayList.removeMember(105);
		
		//ȸ�� ��ȸ
		mArrayList.showAllMember();
	}

}
