package customermanage;

public class CustomerTest {

	public static void main(String[] args) {
		// �ڵ� ����ȯ -> ���������� ����
		//�θ� Ŭ������ �ν��Ͻ� ����
		Customer c1 = new Customer(101, "���");
		Customer vip1 = new VIPCustomer(102, "���", 777);
		
		int price = 10000;
		
		c1.calcPrice(price);
		vip1.calcPrice(price);
		
		System.out.println(c1.showInfo());
		System.out.println(vip1.showInfo());

	}

}
