package customers;

public class VIPCustomer extends Customer{
	
	private int agentId;  //���� ���̵�
	double saleRatio;     //���� ������
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override //�޼��� ������
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}

	@Override
	public String showInfo() {
		return super.showInfo() + " ��� ���� ID�� " 
	             + agentId + "�Դϴ�.";
	}
	
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
}
