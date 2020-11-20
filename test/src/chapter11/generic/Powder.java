package chapter11.generic;

public class Powder extends Meterial {
	
	public String toString() {
		return "재료는 Powder 입니다.";
	}

	@Override
	void doPrinting() {
		System.out.println("Powder 프링팅입니다.");
		
	}
}
