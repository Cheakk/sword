package com.java.se;

public class ExecuteOrder {

	static {
		System.out.println("im static");
	}

	public ExecuteOrder() {
		super();
		System.out.println("im construct");
	}

	public void print(String str) {
		System.out.println("im string");
	};

	public void print(Object object) {
		System.out.println("im object");
	};

	public static void main(String[] args) {
		ExecuteOrder ex = new ExecuteOrder();
		Object o = new Object();
	}

}
