package innerclass;

public class ButtonTest {

	public static void main(String[] args) {
		Button button = new Button();
		//CallListener ��ü ����
		button.setListener(new CallListener());
		button.touch();
		
		//MessageListener ��ü ����
		button.setListener(new MessageListener());
		button.touch();
		
		//�͸� ���� ��ü - ���� ���
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");
			}
		});
		button.touch();
	}

}
