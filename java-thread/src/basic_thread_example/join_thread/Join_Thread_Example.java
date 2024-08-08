package basic_thread_example.join_thread;

public class Join_Thread_Example {
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		
		t1.start();
		t2.start();
		try {
			t1.join(); //Once the Thread 1 complete then the Main thread will start execution
					   //The execution of Main thread will start once the Thread 1 completes
					   // User Thread t2 will continue in between t1 user thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread done executing!");

	}

}

class Thread1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread 1 :: "+i);
		}
		
	}
	
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 15; i++) {
			System.out.println("Thread 2 :: "+i);
		}
		
	}
	
}