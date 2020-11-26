package chapter12.innerclass;


class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		//지역 내부 클래스 (로컬 이너 클래스)
		class MyRunnable implements Runnable{
	
			@Override
			public void run() {
				//지역변수가 메소드가 호출되서 끝날때까지 유요하다
				//myRunnable이 반환되고 나면 run은 언제든지 부를수 있다.
				//그렇게 되면 변수는 없어저 버린 상태이기 때문에
				//지역내부클래스가 쓰이는 변수들은 전부 상수가 되어 버린다.
				
				//num += 10;
				//i = 200;
				System.out.println(i);
				System.out.println(num);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		
		}
		
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
