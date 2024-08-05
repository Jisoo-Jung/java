package threadTest;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("작업 중...");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {;}
		}
		
	}
	
}
