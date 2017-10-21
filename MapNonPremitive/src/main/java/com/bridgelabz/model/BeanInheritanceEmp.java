package com.bridgelabz.model;

public class BeanInheritanceEmp {
	
	private int id;
	private String name;
	private BeanInheritanceAddress address;
	
	public BeanInheritanceEmp(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public BeanInheritanceEmp(int id,String name,BeanInheritanceAddress address) {
		 
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println(id+" \n"+name);
		System.out.println(address);
	}

}
