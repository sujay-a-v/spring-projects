package com.bridgelabz.model;

import java.util.Iterator;
import java.util.List;

public class ListData {
	
	private int id;
	private String name;
	private List<String> hobbies;
	
	public ListData() {
		System.out.println("ListData Constructor");
	}
	
	public ListData(int id,String name,List<String> hobbies)
	{
		this.id=id;
		this.name=name;
		this.hobbies=hobbies;
	}
	
	public void display()
	{
		System.out.println(id+" \n"+name+"\n Hobbies are");
		Iterator<String> itr= hobbies.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
