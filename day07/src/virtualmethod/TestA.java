package virtualmethod;

public class TestA {
	
	int num;
	
	void aaa() {
		System.out.println("aaa() ���");
	}

	public static void main(String[] args) {
		//�ν��Ͻ��� �ٸ� �ּ��̰� �޼���� ���� �ּҿ� ��ġ�Ѵ�.
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();

	}

}
