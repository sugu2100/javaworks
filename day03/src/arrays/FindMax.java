package arrays;

public class FindMax {

	public static void main(String[] args) {
		// �ִ밪 ã��
		int[] arr = {3, 7, 1, 5, 8, 4};
		int max = arr[0];  //max���� 0�� �ε����� �ʱ�ȭ
		
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) { //�ִ밪�� ��
				max = arr[i];  //�ִ밪�� ����
			}
		}
		System.out.println("max = " + max);
		
		//�ִ밪�� ��ġ
		int max_idx = 0;  //0�� �ε����� ����
		for(int i=1; i<arr.length; i++) {
			if(arr[max_idx] < arr[i]) { //�ִ밪�� ��
				max_idx = i;  //max_idx�� ����
			}
		}
		System.out.println("max_idx = " + max_idx);
		
		
		//�ּҰ� ã��
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i]) { //�ּҰ��� ��
				min = arr[i];  //�ּҰ��� ����
			}
		}
		System.out.println("min = " + min);
		
		//�ּҰ� ��ġ
		int min_idx = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[min_idx] > arr[i]) { //�ִ밪�� ��
				min_idx = i;  //max_idx�� ����
			}
		}
		System.out.println("min_idx = " + min_idx);

	}

}
