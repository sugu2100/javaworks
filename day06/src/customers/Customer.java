package customers;

public class Customer {
	protected int customerId;        //�� ���̵�
	protected String customerName;   //�� �̸�
	protected String customerGrade;  //�� ���
	int bonusPoint;        //���ʽ� ����Ʈ
	double bonusRatio;     //���ʽ� ������
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;  //1%
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	//���ʽ� ����Ʈ ���
	public int calcPrice(int price) { //���ʽ�����Ʈ = ���� * ���ʽ�������
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	//���� ���
	public String showInfo() {
		return customerName + "���� ����� " + customerGrade + 
				"�̰�, ���ʽ� ����Ʈ�� " + bonusPoint + "���Դϴ�.";
	}
	
	
	
}
