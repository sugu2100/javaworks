package customers;

public class VIPTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		VIPCustomer vip1 = new VIPCustomer();
		
		c1.setCustomerName("�Ż��Ӵ�");
		vip1.setCustomerName("�̼���");
		vip1.setAgentId(123);
		
		//���ʽ� ����Ʈ ���
		int price = 10000;
		price = vip1.calcPrice(price);
	
		
		//���� ���
		System.out.println(c1.showInfo());
		System.out.println("���� ������ " + price + "���Դϴ�.");
		System.out.println(vip1.showInfo());
	}

}
