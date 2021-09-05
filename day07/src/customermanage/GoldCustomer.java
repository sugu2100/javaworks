package customermanage;

public class GoldCustomer extends Customer{
	double saleRatio;  //���� ������
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;  //���ʽ� ������ 2%
		saleRatio = 0.1;    //10%
	}
	
	@Override //�޼��� ������
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);   //���� ����
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
}
