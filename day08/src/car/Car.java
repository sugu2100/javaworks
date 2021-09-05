package car;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//���ø� �޼��� ����
	public final void run() { //��� ���� Ŭ������ ������ �� ����
		startCar();
		drive();
		stop();
		turnOff();
	}
}
