package collection.map;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//ȸ�� ����
		memberHashMap.addMember(new Member(1001, "���̹�"));
		memberHashMap.addMember(new Member(1002, "�Ｚ����"));
		memberHashMap.addMember(new Member(1003, "�����ڵ���"));
		memberHashMap.addMember(new Member(1002, "LG����"));
		
		//��ü ���
		memberHashMap.showAllMember();
		System.out.println("===============================");
				
		//ȸ�� ����
		memberHashMap.removeMember(1001);
		memberHashMap.removeMember(1005);
		
		//��ü ���
		memberHashMap.showAllMember();
	}

}
