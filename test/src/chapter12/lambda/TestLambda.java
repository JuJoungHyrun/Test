package chapter12.lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdaStar = s->System.out.println(s);
		lambdaStar.showString("test");
		
		showMyString(lambdaStar);
		
		PrintString test = returnString();
		test.showString("test3");
	}

	public static void showMyString(PrintString p) {
		p.showString("test2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s+"!!!");
	}
}
