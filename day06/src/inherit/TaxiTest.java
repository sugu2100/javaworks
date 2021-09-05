package inherit;

class Car{
	String brand;
	int cc;    //��ⷮ
	
	public Car(String brand, int cc) {
		this.brand = brand;
		this.cc = cc;
	}
}

//Car�� ����� Taxi Ŭ����
class Taxi extends Car{
	int passenger;  //�°�
	
	//super Ű���� ��� ����
	public Taxi(String brand, int cc, int passenger) {
		super(brand, cc);  //�θ� ����� super() ���
		this.passenger = passenger;
	}
	
	public void showInfo() {
		System.out.println("�� �귣�� : " + brand + ", cc : " 
	              + cc + ", �°���: " + passenger);
	}
}

public class TaxiTest {

	public static void main(String[] args) {
		Taxi taxi = new Taxi("Sonata", 2500, 3);
		taxi.showInfo();
		
	}

}
