package com.java.se.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestCondiction {

	TestCondiction test = new TestCondiction();

	public static void main(String[] args) throws InterruptedException {
		Lock lock = new ReentrantLock();
		lock.wait();
		Condition cd = lock.newCondition();
		System.out.println("我要await了");
		cd.await();
		System.out.println("我开始了"
				+ "");
	}
}
