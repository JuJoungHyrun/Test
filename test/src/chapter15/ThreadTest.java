package chapter15;

class MyThread extends Thread{

	@Override
	public void run() {
		int i;
		for(i =0; i<=200;i++) {
			System.out.print(i + "\t");
			
			try {
				//Thread 클래스의 스테틱 메서드
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		System.out.println("end");
	}

}
