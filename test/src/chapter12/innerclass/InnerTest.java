package chapter12.innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
		
	}
	
	//내부에서만 사용 할려면 private 제한자 선언
	class InClass{
		int iNum = 100;
		//OutClass 생성 이후에 생성되기 때문에 static 변수를 사용 할 수 없다.
		//static int sInNum = 200;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticinClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		static void sTest() {
			//System.out.println(inNum); static 클래스 안에 static 메소드 안에 static 변수만 사용
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
	
		OutClass.InStaticinClass sInClass = new OutClass.InStaticinClass();
		sInClass.inTest();
		
		OutClass.InStaticinClass.sTest();
	}
	
	

}
 