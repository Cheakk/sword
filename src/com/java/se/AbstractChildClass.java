package com.java.se;

public class AbstractChildClass extends AbstractReview{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String bb() {
		// TODO Auto-generated method stub
		return "child bb";
	}
	public String aa()   {
		return "child aa";
	}
	
	public String cc()   {
		return "child cc";
	}
	
	public static void main(String[] args) {
		AbstractReview abstractReview = new AbstractChildClass();
		System.out.println(abstractReview.bb());
		System.out.println(abstractReview.aa());
	}
	
}
