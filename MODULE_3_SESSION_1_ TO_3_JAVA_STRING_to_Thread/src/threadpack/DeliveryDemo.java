package threadpack;

class DeliveryBoy implements Runnable {
	private String order;

	public DeliveryBoy(String order) {
		this.order = order;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Delivering the order " + i + "Km reached");
				Thread.sleep(1000);
			}
			System.out.println(order + " Delivered Successfully");
		} catch (InterruptedException e) {
			System.out.println("Order cancelled Delivery Stopped");
		}
	}
}

public class DeliveryDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread customer1 = new Thread(new DeliveryBoy("Biriyani"));
		Thread customer2 = new Thread(new DeliveryBoy("Juice"));

		customer1.start();
		customer1.join();

		customer2.start();
		Thread.sleep(2000);
		System.out.println("Customer 2 cancelled the Order");
		customer2.interrupt();
		customer2.join();

	}
}
