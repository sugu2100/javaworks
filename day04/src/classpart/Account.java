package classpart;

public class Account {
	private String ano;    //���¹�ȣ
	private String owner;  //������
	private int balance;   //�ܾ�
	
	public Account() {}
	
	//�Ű������� �ִ� ������(�ܺ� �Է�)
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//set+�������() �޼��� - �ܺ� �Է�
	public void setAno(String ano) {
		this.ano = ano;   
	}
	
	//get+�������() - ���
	public String getAno() {
		return ano;
	}
	
	//������ �޼���
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	//�ܾ� �޼���
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
}
