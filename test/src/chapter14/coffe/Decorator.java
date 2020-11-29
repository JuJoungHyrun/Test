package chapter14.coffe;

public abstract class Decorator extends Coffee{
	
	//혼자서 돌아갈수 없어서 생성자에서는 항상 또다른 커피를 가져와야 한다.
	//모두가 구현되어 있지만 추상클래스 사용은 상속을 위해서만 사용한다.
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}
}
