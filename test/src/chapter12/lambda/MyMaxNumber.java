package chapter12.lambda;

//람다식을 위한 인터페이스라 알림
@FunctionalInterface
public interface MyMaxNumber {
	//메서드 2개 이상 선언 X
	int getMaxNumber(int x, int y);
	//Invalid '@FunctionalInterface' annotation; 
	//MyMaxNumber is not a functional interface
	//void add(int x, int y);
}
