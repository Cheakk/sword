package com.java.se.happendsbefore;

public class HappendsBeforeCase implements Runnable{

	@Override
	public void run() {
		System.out.println("im run method");
		a();
	}
	
	public void a() {
		System.out.println("you are fired");
	}
	
	public static void main(String[] args) {
		HappendsBeforeCase hb = new HappendsBeforeCase();
		Thread th = new Thread(hb);
		System.out.println(th.isInterrupted());
		th.start();
	}

}
