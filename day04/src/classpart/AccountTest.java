package classpart;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		//account.ano = "1000";
		//��������� ���������ڰ� private�̹Ƿ� ������ �� ����
		
		Account account2 = new Account("100-222-3333", "ȫ�浿", 30000);
		
		account.setAno("100-111-222");
		account.setOwner("�̰�");
		account.setBalance(50000);
		
		System.out.println("���� ��ȣ: " + account.getAno());
		System.out.println("������: " + account.getOwner());
		System.out.println("�ܾ�: " + account.getBalance());
		System.out.println("-----------------------------");
		System.out.println("���� ��ȣ: " + account2.getAno());
		System.out.println("������: " + account2.getOwner());
		System.out.println("�ܾ�: " + account2.getBalance());
	}

}
