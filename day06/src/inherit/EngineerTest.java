package inherit;

class Person{
	String name;
	int age;
	
	Person(){}
}

//Person�� ����� Engineer Ŭ����
class Engineer extends Person{ 
	int companyId;  //���
}

public class EngineerTest {

	public static void main(String[] args) {
		Engineer eng = new Engineer();
		
		eng.name = "�̺���";  //�θ� ����� ����
		eng.age = 30;       //�θ� ����� ����
		eng.companyId = 13; //�ڱ� ����� ����
		
		System.out.println("�̸� : " + eng.name);

	}

}
