package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// �迭�� ������ ��� ��� ���� ó��
		int[] arr = new int[3];
		
		try {  //���ܰ� �߻��� �� �ִ� ������ try{} ����
			//�� ����
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			//���� ó�� �κп� catch() ����
			//System.out.println(e);
			System.out.println("���� ó�� �κ�");
		}
	}
}
