package com.java.se;

public class TestSum {
	
public static void main(String[] args) {
	int a = 3000 ; 
	int b = 15 ;
	Integer c = new Integer(3000) ; 
	Integer d = new Integer(15) ;
	
	float f = 19.9f;
	float g = 19.9f;
	float h = 0; 
	
	Float i = new Float(19.9f);
	Float j = new Float(19.9f);
	System.out.println(c == a);
	System.out.println(f == g);
	System.out.println(i== j);
	
	
	String aa = "ads";
	String bb = aa ; 
	bb = aa.trim();
	System.out.println(aa+"-----------"+bb);
	
}
}
