package chapter15;

class Bank{
	private int money = 10000;
	
	public  void saveMone(int save) {
		synchronized(this) {
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m + save);
		}
	}
	
	public synchronized void minusMoney(int minus) {
	int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

class Park extends Thread{
	
	public void run() {
		synchronized (SycTest.myBank) {
			System.out.println("start sava");
			SycTest.myBank.saveMone(3000);
			System.out.println("save money : " + SycTest.myBank.getMoney() );
		}
	}
}

class ParkWife extends Thread{
	
	public void run() {
		synchronized (SycTest.myBank) {
			System.out.println("start minus");
			SycTest.myBank.minusMoney(1000);
			System.out.println("minus money : " + SycTest.myBank.getMoney() );
		}
	}
}

public class SycTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		ParkWife pw = new ParkWife();
		pw.start();
		
	}

}
