package customermanage;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		// ArrayList�� ����Ͽ� ���������� �����ϱ�
		//���� �� 5�� : SILVER-2��, GOLD-2��, VIP - 1��
		ArrayList<Customer> cList = new ArrayList<>();
		
		//�ǹ� 2�� ����
		Customer lee = new Customer(1001, "�̼���");
		Customer shin = new Customer(1002, "�Ż��Ӵ�");
		Customer hong = new GoldCustomer(1003, "ȫ�浿");
		Customer kang = new GoldCustomer(1004, "������");
		Customer king = new VIPCustomer(1005, "�������", 1234);
		
		//����Ʈ�� �߰�
		cList.add(lee);
		cList.add(shin);
		cList.add(hong);
		cList.add(kang);
		cList.add(king);
		
		
		
		System.out.println("====== ���� ���ݰ� ���ʽ� ����Ʈ ��� ======");
		int price = 10000;
		for(Customer c : cList) {
			int cost = c.calcPrice(price);  //���� ����
			System.out.println(c.getCustomerName() + "���� " + cost + "�� �����߽��ϴ�.");
		}
		
		System.out.println("======== �� ���� ��� ============");
		for(Customer c : cList)
			System.out.println(c.showInfo());

	}

}
