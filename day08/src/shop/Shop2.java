package shop;

public class Shop2 extends HeadShop{
	
	public Shop2() {
		System.out.println("������ �����Դϴ�.");
	}

	@Override
	public void sellDoenjangJJige() {
		System.out.println("������� : 6,000��");
	}

	@Override
	public void sellKimchiJJige() {
		System.out.println("��ġ��� : 6,500��");
	}

	@Override
	public void sellBibimBap() {
		System.out.println("����� : 7,000��");
	}

}
