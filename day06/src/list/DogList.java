package list;

import java.util.ArrayList;

public class DogList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		
		//������ 3���� ����
		Dog dog1 = new Dog();
		dog1.setName("����");
		dog1.setType("������");
		
		Dog dog2 = new Dog();
		dog2.setName("�鱸");
		dog2.setType("��Ʈ����");
		
		Dog dog3 = new Dog();
		dog3.setName("�˵���");
		dog3.setType("�ҵ�");
		
		/*Dog dog1 = new Dog("����", "������");
		Dog dog2 = new Dog("����", "������");
		Dog dog3 = new Dog("����", "������");*/
		
		//����
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		//���
		for(int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		
	}

}
