package interfaceex.shelf;

import java.util.ArrayList;

public class Shelf {
	ArrayList<String> shelf;
	
	public Shelf() { //�⺻ ������ ArrayList ����
		shelf = new ArrayList<>();
	}
	
	public int getCount() {
		return shelf.size();  //ArrayList�� ũ��(����)
	}

}
