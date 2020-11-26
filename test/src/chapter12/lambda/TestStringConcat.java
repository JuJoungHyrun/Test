package chapter12.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		//인터페이스를 상속받아 클래스를 만드는것
		StringConImpl implString = new StringConImpl();
		implString.makeString("hello", "world");
		
		//인터페이스를 람다식으로 사용
		StringConcat stringConcat = (s , v) -> System.out.println(s+","+v);
		stringConcat.makeString("hello", "world");
		
		//내부클래스
		StringConcat concat = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+ " , " + s2);
			}
		};
		concat.makeString("hello", "world");
		
		
	}

}
