package arrays;

public class CopyArray {

	public static void main(String[] args) {
		// �迭�� ����
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = new int[4];
		
		// arr1�� �迭 ��Ҹ� arr2�� ����
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
			//arr2[0] = 1
		}
		
		//arr2�� ���
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// ������ �迭 ���� ����
		char[] chArr1 = {'N', 'E', 'T'};
		char[] chArr2 = new char[3];
		
		for(int i=0; i<chArr1.length; i++) {
			chArr2[2-i] = chArr1[i];
			//chArr2[2] = chArr1[0]
			//chArr2[1] = chArr1[1]
			//chArr2[0] = chArr1[2]
		}
		
		for(int i=0; i<chArr2.length; i++) {
			System.out.print(chArr2[i] + " ");
		}

	}

}
