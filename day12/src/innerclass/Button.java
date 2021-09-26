package innerclass;

public class Button {
	
	private OnClickListener listener;
	
	interface OnClickListener{
		public void onClick();
	}
	
	//set()
	public void setListener(OnClickListener listener) {//매개변수 구현 객체
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
}
