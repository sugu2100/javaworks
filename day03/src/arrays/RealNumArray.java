package arrays;

public class RealNumArray {
	public static void main(String[] args) {
		//�Ǽ��� �迭 ���� �� �����ϱ�
		double[] data = new double[5];
		double sum = 0.0;  //����
		double times= 0.0;  //�Ѱ���
		
		//���� ����
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//��ȸ
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		//�հ�
		for(int i=0; i<data.length; i++) {
			sum += data[i];
			times *= data[i];
		}
		System.out.println("�հ�: " + sum);
		System.out.println("��: " + times);
	}
}
