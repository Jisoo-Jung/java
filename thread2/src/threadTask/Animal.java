package threadTask;


	
public class Animal {
	public static void main(String[] args) {
		new Test() {
			
			@Override
			public String testCrying(String name) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		Zoo zoo = new Zoo();
	      
	      Thread cow = new Thread(zoo, "음매");
	      Thread elephant = new Thread(zoo, "뿌우");
	      Thread lion = new Thread(zoo, "어흥");
	      
	      
	      
	      cow.start();
	      elephant.start();
	      
	      try {
			cow.join();
			elephant.join();
		} catch (InterruptedException e) {;}
	      
	      lion.start();
	      
	      
	     
	}
}
