package customers;

public class VIPCustomer extends Customer{
	
	private int agentId;  //상담원 아이디
	double saleRatio;     //구매 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override //메서드 재정의
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}

	@Override
	public String showInfo() {
		return super.showInfo() + " 담당 상담원 ID는 " 
	             + agentId + "입니다.";
	}
	
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
}
