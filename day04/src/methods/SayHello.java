package methods;

public class SayHello {

	public static void main(String[] args) {
		//System.out.println("Hello~ Elsa");
		//�Լ� ȣ��
		sayHello();
		sayHello();
		sayHello2("ö��");
		sayHello2("����");
	}
	
	//�̸��� sayHello�� �Լ�(�޼���) ����
	public static void sayHello() {
		System.out.println("Hello~ ");
	}
	
	//�Ű������� �ִ� �Լ� ����
	public static void sayHello2(String name) { //�Ű� ����
		System.out.println("Hello~ " + name);
	}

}
