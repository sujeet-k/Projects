package basic_thread_example.thread_creation;

public class Thread_Creation_Using_Thread_Classs {

	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();
		t2.start();
	}

}

class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread 1 :: "+i);
		}
		
	}
	
}

class Thread2 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 15; i++) {
			System.out.println("Thread 2 :: "+i);
		}
		
	}
	
}
