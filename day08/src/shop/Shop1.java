package shop;

public class Shop1 extends HeadShop{
	
	public Shop1() {
		System.out.println("���а� �����Դϴ�.");
	}

	@Override
	public void sellDoenjangJJige() {
		System.out.println("������� : 5,000��");
	}

	@Override
	public void sellKimchiJJige() {
		System.out.println("��ġ��� : 5,500��");
	}

	@Override
	public void sellBibimBap() {
		System.out.println("����� : 6,000��");
	}

}
