package threadpack;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		System.out.println("This code is running in a thread " 
				+(Thread.currentThread().getName()) + " "
				+ Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
		thread.setPriority(6);

		ThreadDemo thread2 = new ThreadDemo();
		thread2.setPriority(MAX_PRIORITY);

		thread.start();
		thread2.start();

		System.out.println("This code is outside of the thread");
	}
}