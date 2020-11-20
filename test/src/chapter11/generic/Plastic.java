package chapter11.generic;

public class Plastic extends Meterial {
	
	public String toString() {
		return "재료는 플라스닉 입니다.";
	}

	@Override
	void doPrinting() {
		System.out.println("Plastic 프링팅입니다.");
	}
}
