package staticsample;

public class Student {
	private int id;       //�й�, �ν��Ͻ� ����
	private String name;  //�̸�
	private static int serialNum = 100; //���ع�ȣ, Ŭ���� ����
	
	public Student() {
		serialNum++;
		id = serialNum;
	}
	
	//id �������� �޼���
	public int getId() {
		return id;
	}
	
	//�̸��� �Է¹޴� �޼���
	public void setName(String name) {
		this.name = name;
	}
	
	//�̸��� �������� �޼���
	public String getName() {
		return name;
	}
}
