package threadpack;

//========================== Thread Customer ==================================
class Customer extends Thread {
	String item;

	public Customer(String item) {
		this.item = item;
	}

	@Override
	public void run() {
		System.out.println("I want to order : " + item);
	}
}
//========================== End of Customer Thread======================

//========================== Thread Waiter ==================================
class Waiter extends Thread {
	String item;

	public Waiter(String item) {
		this.item = item;
	}

	@Override
	public void run() {
		System.out.println("Waiter: Received the order : " + item);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Waiter: Order " + item + " given to Chef");
	}
}

//========================== Thread Chef ==================================
class Chef extends Thread {
	String item;

	public Chef(String item) {
		this.item = item;
	}

	@Override
	public void run() {
		System.out.println("Preparing the order : " + item);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Order " + item + " is Ready to Serve");
	}
}

public class RestaurantDemo {

	public static void main(String[] args) throws InterruptedException {

		String[] orders = { "Masala Dosa", "Coffee", "Banana Fry" };
		for (String order : orders) {
			Customer customerOne = new Customer(order);
			Waiter waiter = new Waiter(order);
			Chef chef = new Chef(order);

			customerOne.start();
			customerOne.join();

			waiter.start();
			waiter.join();

			chef.start();
			chef.join();
			System.out.println("Order " + order + " Served to the Customer");
			System.out.println("========================================");


		}
		/*
		 * String order = "Masala Dosa"; Customer customerOne = new Customer(order);
		 * Waiter waiter = new Waiter(order); Chef chef = new Chef(order);
		 * 
		 * customerOne.start(); customerOne.join();
		 * 
		 * waiter.start(); waiter.join();
		 * 
		 * chef.start(); chef.join();
		 */

	}

}
