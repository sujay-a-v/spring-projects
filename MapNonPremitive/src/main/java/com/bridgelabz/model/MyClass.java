package com.bridgelabz.model;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MyClass {
	private String name;
	private long mobile;
	private String email;
	private Map<Friend,Details> friend;
	
	public MyClass(String name,long mobile,String email, Map<Friend,Details> friend) {
		this.name=name;
		this.mobile=mobile;
		this.email=email;
		this.friend=friend;
	}

	public void display()
	{
		System.out.println("My Details");
		System.out.println(name+" "+mobile+" "+email);
		System.out.println("\n\nMy Friends Details");
		Set<Entry<Friend,Details>> set=friend.entrySet();
		Iterator<Entry<Friend,Details>> itr= set.iterator();
		while(itr.hasNext())
		{
			Entry<Friend,Details> entry=itr.next();
			Friend friend=entry.getKey();
			Details details=entry.getValue();
			System.out.println(friend+" "+details);
		}
	}
}
