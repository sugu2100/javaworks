package downcasting;

import java.util.ArrayList;

public class AnimalTest2 {

	public static void main(String[] args) {
		ArrayList<Animal> animalList = new ArrayList<>();
		
		//��ü ����
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		//��ü �߰�
		animalList.add(human);
		animalList.add(eagle);
		animalList.add(tiger);
		
		//���
		for(int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			animal.move();
		}
		
		System.out.println("=== ������ ������ �ٿ� ĳ���� ===");
		for(int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Human) {
				Human h = (Human)animal;
				h.readBook();
			}else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
			}else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
			}else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
		
	}

}
