package innerclass;

public class Button {
	
	private OnClickListener listener;
	
	interface OnClickListener{
		public void onClick();
	}
	
	//set()
	public void setListener(OnClickListener listener) {//�Ű����� ���� ��ü
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
}
