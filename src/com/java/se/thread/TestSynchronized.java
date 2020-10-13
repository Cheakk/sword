package com.java.se.thread;

import java.util.HashSet;
import java.util.Set;

public class TestSynchronized implements Runnable {

	public synchronized void aa() throws InterruptedException {
		System.out.println("ÐÞÊÎÊµÀý·½·¨");
		Thread.sleep(5000);
	}

	public Object objec;

	public void bb() {
		synchronized (objec) {
		}
		Set<Integer> repeat = new HashSet<>();
	}

	public void cc() {
		synchronized (TestSynchronized.class) {
		}
	}
	
	public static synchronized void dd() {
		
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
		ThreadLocal<String> t = new ThreadLocal<String>();
		t.set("asd");
		t.set("vvv");
		System.out.println(t.get());
		System.out.println(t.get());
		StringBuffer adb = new StringBuffer("asccc");
		System.out.println(adb.reverse());
	}

}
