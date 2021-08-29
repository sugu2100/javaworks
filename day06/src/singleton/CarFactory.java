package singleton;

public class CarFactory {
	//�̱��� ����
	private static CarFactory instance;
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null)   //instance�� ���������
			instance = new CarFactory();
		return instance;
	}
	
	//�ڵ��� ���� �޼���
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
