package lambda;

public class MyFunctionalInterfaceTest2 {

	public static void main(String[] args) {
		MyFunctionalInterface2 fi2;
		//���ϱ� �Լ�
		fi2 = (x) -> {
			x = x + 10;
			System.out.println(x);
		};
		fi2.method(1);
		
		//{} ����
		fi2 = (x) -> System.out.println(x + 10);
		fi2.method(1);
		
		//������ ��� �Լ�
		fi2 = (y) -> System.out.println(y * y);
		fi2.method(4);
	}

}
