package com.bridgelabz.model;

import java.util.Iterator;
import java.util.List;

public class NonPremetive1 {
	
	private int id;
	private String name;
	private List<NonPremetive2> nonString2;
	
	public NonPremetive1(int id, String name, List<NonPremetive2> nonString2) {
		this.id=id;
		this.name=name;;
		this.nonString2=nonString2;	
	}
	
	public void display()
	{
		System.out.println(id+" \n"+name+" \nMy Friends are");
		Iterator<NonPremetive2> itr=nonString2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
