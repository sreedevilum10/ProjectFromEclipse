//package threadpack;
//
//class Table {
////	synchronized void printTable(int n) {// method not synchronized
////		System.out.println("Multiplication  Table of "+n);
////
////		for (int i = 1; i <= 10; i++) {
////			System.out.println(n + " * " + i + " = " + n * i);
////			try {
////				Thread.sleep(400);
////			} catch (Exception e) {
////				e.printStackTrace();
////				;
////			}
////		}
////	}
//	void printTable(int n) {// method not synchronized
//		System.out.println("Multiplication  Table of " + n);
//		synchronized (this) {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(n + " * " + i + " = " + n * i);
//				try {
//					Thread.sleep(400);
//				} catch (Exception e) {
//					e.printStackTrace();
//
//				}
//			}
//		}
//	}
//}
//
////===================Thread 1 ===============================
//class MyThreadOne extends Thread {
//	Table t;
//
//	MyThreadOne(Table t) {
//		this.t = t;
//	}
//
//	public void run() {
//		t.printTable(5);
//	}
//
//}
//
////=============Thread 2 ===================================
//class MyThreadTwo extends Thread {
//	Table t;
//
//	MyThreadTwo(Table t) {
//		this.t = t;
//	}
//
//	public void run() {
//		t.printTable(100);
//	}
//}
//
//public class TestSynchronization {
//	public static void main(String args[]) {
//		Table obj = new Table();
//		MyThreadOne t1 = new MyThreadOne(obj);
//		MyThreadTwo t2 = new MyThreadTwo(obj);
//		t1.start();
//		t2.start();
//	}
//}