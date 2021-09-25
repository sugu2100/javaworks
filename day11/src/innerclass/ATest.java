package innerclass;

class A{
	A(){
		System.out.println("A ��ü ����");
	}
	
	class B{  //���� �ν��Ͻ� Ŭ����
		B(){
			System.out.println("B ��ü ����");
		}
	}
	
	static class C{ //���� ���� Ŭ����
		C(){
			System.out.println("C ��ü ����");
		}
	}
	
	void method() { //���� ���� Ŭ����
		class D{
			D(){
				System.out.println("D ��ü ����");
			}
		}
		D d = new D();
	}
	
}

public class ATest {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		
		A.C c = new A.C();
		
		a.method();
	}

}
