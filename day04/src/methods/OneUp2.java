package methods;

public class OneUp2 {
	
	static int x = 1;  //static ���� = ���� ����(����)

	public static int oneUp() {
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		// 1 ���� �Լ� ȣ��
		System.out.println(oneUp());  // 2
		System.out.println(oneUp());  // 3
		System.out.println(oneUp());  // 4

		//x�� ���
		System.out.println(x);
	}

}
