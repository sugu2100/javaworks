package car;

public class Main {

	public static void main(String[] args) {
		System.out.println("==== ���� �����ϴ� �ڵ��� ====");
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("==== ����� �����ϴ� �ڵ��� ====");
		Car manCar = new ManualCar();
		manCar.run();
	}

}
