package interfaceex.calculator;

public interface Calculator {
	
	int ERROR = -9999;  //���� -> ������ �� �������̽� ����� �ٲ�
	
	int add(int n1, int n2);   //�߻� �޼��� , ���ϱ�
	int subtract(int n1, int n2);  //����
	int times(int n1, int n2);
	int divide(int n1, int n2);

}
