package innerclass;

public class Outer2 {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runner = new Runnable() {  //이름없는 내부 클래스임
		//익명 객체 runner
		@Override
		public void run() {
			System.out.println(outNum + " : 외부 클래스의 인스턴스 변수");
			System.out.println(sNum + " : 외부 클래스의 정적 변수");	
		}
	};//세미콜론을 붙여야 run() 구현 가능
}
