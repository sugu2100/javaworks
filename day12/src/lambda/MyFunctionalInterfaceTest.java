package lambda;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		//���ٽ����� ���� - �͸� �Լ�
		fi = () -> {
			String str = "Hello~ lambda!";
			System.out.println(str);
		};
		fi.method();
		
		//{} ����
		fi = () -> System.out.println("Hello~ lambda!");
		fi.method();
	}

}
