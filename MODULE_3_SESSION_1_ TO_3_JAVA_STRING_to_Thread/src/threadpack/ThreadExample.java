package threadpack;

class DownloadThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Downloading....." + (20 * i) + " %");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Downloading Completed");
	}

}

public class ThreadExample {
	public static void main(String[] args) {

		DownloadThread t1 = new DownloadThread();
		t1.start(); // starts a

		for (int i = 1; i <= 5; i++) {
			System.out.println("User is Using WhatsApp......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
}
