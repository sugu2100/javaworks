package thissample;


class Birthday{
	private int day;
	private int month;
	private int year;
	
	//public Birthday() {}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisTest {

	public static void main(String[] args) {
		// Birthday Ŭ���� ���
		Birthday bDay = new Birthday();
		bDay.setYear(2021);
		
		bDay.printThis();  //�޸� �ּ� ���
		System.out.println(bDay); //�޸� �ּ�
	}
}
