package array2d;

public class Array2D {

	public static void main(String[] args) {
		// ������ �迭 ������ ���
		int[][] a = new int[2][3];
		int i, j;
		
		System.out.println("�迭�� ����(��) : " + a.length + "��");
		System.out.println("�迭�� ����(��) : " + a[0].length + "��");
		System.out.println("�迭�� ����(��) : " + a[1].length + "��");
		
		//����
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		//���
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
