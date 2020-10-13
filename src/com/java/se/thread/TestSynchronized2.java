package com.java.se.thread;

public class TestSynchronized2 extends Thread{
	
	public synchronized void aa () throws InterruptedException {
		System.out.println("修饰实例方法");
		Thread.sleep(5000);
	}
	
	
	public synchronized void bb() {
		System.out.println("修饰实例方法bb");
	}

	@Override
	public void run() {
		try {
			aa();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
			TestSynchronized2 testSynchronized = new TestSynchronized2();
			synchronized(testSynchronized) {
				
			}
		}

}
