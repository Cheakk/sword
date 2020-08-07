package com.java.se;

public class ExecuteOrderChild extends ExecuteOrder {

	static {
		System.out.println("im static Child");
	}

	public ExecuteOrderChild() {
		System.out.println("im construct child");
	}

	public void print(String str) {
		System.out.println("im string Child");
	};

	public void print(Object object) {
		System.out.println("im object Child");
	};

	public static void main(String[] args) {
		ExecuteOrderChild ex = new ExecuteOrderChild();
	}

}
