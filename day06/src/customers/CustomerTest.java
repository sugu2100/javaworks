package customers;

public class CustomerTest {

	public static void main(String[] args) {
		//�⺻ �����ڷ� �ν��Ͻ� �����ϱ�
		Customer c1 = new Customer();   //Customer �ν��Ͻ� ����
		VIPCustomer vip1 = new VIPCustomer();  //VIPCustomer �ν��Ͻ� ����
		
		c1.setCustomerName("�Ż��Ӵ�");
		vip1.setCustomerName("�̼���");
		vip1.setAgentId(123);
		
		//���ʽ� ����Ʈ ���
		int price = 10000;
		c1.calcPrice(price);
		
		int saledPrice = vip1.calcPrice(price); //���ε� ����
		
		//vip�� ���� ���� ���
	
		
		//���� ���
		System.out.println(c1.showInfo());
		System.out.println(vip1.getCustomerName() + "���� ���� ������ " + saledPrice + "���Դϴ�.");
		System.out.println(vip1.showInfo());
	}

}
