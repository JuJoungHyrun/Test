package chapter15;

class MyRunnable implements Runnable{

	public void run() {
		int i;
		for(i =0; i<=200;i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

public class RunnableTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		MyRunnable runner1 = new MyRunnable();
		Thread th1 = new Thread(runner1);
		th1.start();
		
		MyRunnable runner2 = new MyRunnable();
		Thread th2 = new Thread(runner2);
		th2.start();
		
		//Thread[main,5,main]
		//		스레드이름,우선순위,어디에포함되어있는지
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		
		System.out.println("end");
	}

}
