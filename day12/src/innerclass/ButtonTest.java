package innerclass;

public class ButtonTest {

	public static void main(String[] args) {
		Button button = new Button();
		//CallListener 객체 생성
		button.setListener(new CallListener());
		button.touch();
		
		//MessageListener 객체 생성
		button.setListener(new MessageListener());
		button.touch();
		
		//익명 구현 객체 - 사진 찍기
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		button.touch();
	}

}
