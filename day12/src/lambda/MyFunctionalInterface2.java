package lambda;

@FunctionalInterface
public interface MyFunctionalInterface2 {
	//매개변수도 1개 있고 반환값(return)도 없는 추상메서드 선언
	public void method(int x);
	//public void method2(int y);
	//추상메서드는 1개만 사용 가능 - 이름이 없으므로 구현할때 혼돈이 와서.
}
