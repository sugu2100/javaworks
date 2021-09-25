package collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	//Integer - memberId�� Member�� �ڷ������� hashMap ����
	HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//ȸ�� �߰�
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//ȸ�� ���
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			Integer key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
	//ȸ�� ����
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //�ܺ� memberId�� ���ο� �ִٸ�
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
}







