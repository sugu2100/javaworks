package customers;

public class CustomerTest2 {

	public static void main(String[] args) {
		// �Ű� ������ �ִ� �����ڷ� �ν��Ͻ� �����ϱ�
		Customer c1 = new Customer(101, "���");
		VIPCustomer vip1 = new VIPCustomer(201, "���", 777);
		
		//��ǰ ���� �� ���
		int price = 20000;
	
		c1.calcPrice(price);
		vip1.calcPrice(price);
		
		// ���� ���
		System.out.println(c1.showInfo());
		System.out.println(vip1.showInfo());
	}
}
