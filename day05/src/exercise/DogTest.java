package exercise;

public class DogTest {

	public static void main(String[] args) {
		// Dog �ν��Ͻ� 5�� ����
		Dog[] dogList = new Dog[5];
		
		// dog �ν��Ͻ� ���� 
		Dog dog1 = new Dog();
		dog1.setName("�鱸1");
		dog1.setType("������");
		
		Dog dog2 = new Dog();
		dog2.setName("�鱸2");
		dog2.setType("��Ʈ����");
		
		Dog dog3 = new Dog();
		dog3.setName("�鱸3");
		dog3.setType("�ҵ�");
		
		Dog dog4 = new Dog();
		dog4.setName("�鱸4");
		dog4.setType("������");
		
		Dog dog5 = new Dog();
		dog5.setName("�鱸5");
		dog5.setType("������");
		
		//�迭�� ����
		dogList[0] = dog1;
		dogList[1] = dog2;
		dogList[2] = dog3;
		dogList[3] = dog4;
		dogList[4] = dog5;
		
		System.out.println("=== �Ϲ� for�� ===");
		for(int i = 0; i < dogList.length; i++) {
			System.out.println(dogList[i].showDogInfo());
		}
		
		System.out.println("=== ��� for�� ===");
		for(Dog dog : dogList)
			System.out.println(dog.showDogInfo());
	}
}
