package threadpack;

import java.util.UUID;

class Lulu {
	static String billNo ;

   synchronized	static void generateBill(String counter) {
		billNo = UUID.randomUUID().toString().substring(1,9);
		System.out.println(counter + " generated Bill No " + billNo);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Bill Printed in " + counter);
	}
}

class Counter extends Thread {

	String name;

	public Counter(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		Lulu.generateBill(name);
	}
}

public class StaticSyncDemo {

	public static void main(String[] args) {

		Counter c1 = new Counter("Counter 1");
		Counter c2 = new Counter("Counter 2");
		Counter c3 = new Counter("Counter 3");
		c1.start();
		c2.start();
		c3.start();
	}

}
