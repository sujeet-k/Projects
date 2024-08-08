package basic_thread_example.thread_creation;

public class Thread_Creation_Using_Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadOne());
		Thread t2 = new Thread(new ThreadTwo());
		Thread t3 = new Thread(() -> {		// Using as functional interface	
			for(int i = 0; i < 10; i++) {
				System.out.println("Thread 3 :: "+i);
			}			
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class ThreadOne implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread 1 :: "+i);
		}
		
	}
	
}

class ThreadTwo implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 15; i++) {
			System.out.println("Thread 2 :: "+i);
		}
		
	}
	
}