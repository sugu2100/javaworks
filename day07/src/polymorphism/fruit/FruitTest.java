package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println(" 1.포도 | 2.바나나 | 3.복숭아");
		System.out.println("==========================");
		System.out.print("선택>");
		
		int selNum = scan.nextInt();
		
		Fruit fruit = null;
		if(selNum == 1) {
			fruit = new Grape();  //다형성 : 자동 형변환
		}else if(selNum == 2) {
			fruit = new Banana();
		}else if(selNum == 3) {
			fruit = new Peach();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		fruit.showInfo();
		
		scan.close();
	}

}
