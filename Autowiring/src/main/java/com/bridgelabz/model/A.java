package com.bridgelabz.model;

public class A {
	B b;
	
	
	public A() {
		System.out.println("object A created");
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	
	public void print(){System.out.println("hello a");}  
	public void display(){  
	    print();  
	    b.print();  
	}
	
}
