package threadTask;

//[실습]
//동석이네 동물원에는 3마리의 동물이 있다.
//각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//나머지 1마리 동물은 2마리 동물이 모두 울고 나면 마지막에 운다.
//
//패키지명: threadTask
//
//※ 클래스는 2개만 선언한다. 
//※ 반드시 join()을 사용한다.
//※ 각 동물은 10번씩만 운다.
//※ 람다식을 사용한다.

import java.util.Iterator;

public class Zoo implements Runnable{
	private String cryingKind;
	
	public Zoo() {
		this.cryingKind = null;
	}
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			crying();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {;}
		}
	}

	private void crying() {
		synchronized (this) {
	         this.cryingKind = null;
	      }
	      this.cryingKind = null;
	      System.out.println(Thread.currentThread().getName());
	}

}
