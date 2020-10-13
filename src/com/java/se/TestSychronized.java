package com.java.se;

public class TestSychronized {
	
	public static void main(String[] args) {
		String aa = "aa";
		String bb = "aaa";
		String cc = new String("aa");
		String dd = "a"+"aa";
		String ee ="a";
		String ff ="a";
		String x =new String("a");
		String y =new String("a");
		String gg = new String("a"+"a");
		System.out.println(dd==bb);
		System.out.println(aa==dd);
		System.out.println(aa==(ee+ff));
		System.out.println(dd==gg);
	}

}
