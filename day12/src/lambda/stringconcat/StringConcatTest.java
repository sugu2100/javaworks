package lambda.stringconcat;

public class StringConcatTest {

	public static void main(String[] args) {
		//��ü ���� ��İ� �Լ��� �������̽� ��� ��
		String s1 = "Hello~";
		String s2 = "lambda";
		
		//StringConcatImpl�� ��ü concat ����
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		
		//lambda �� ���� - StringConcat�������̽��� �͸� ��ü ���� ����
		StringConcat concat2;
		concat2 = (v1, v2) -> System.out.println(v1 + ", " + v2);
		concat2.makeString(s1, s2);
		
	}

}
