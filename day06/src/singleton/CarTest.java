package singleton;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("���� : " + car1.getCarNum());
		
		Car car2 = new Car();
		System.out.println("���� : " + car2.getCarNum());
	}

}
