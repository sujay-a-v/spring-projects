package com.bridgelabz.model;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	private String name;
	private long mobile;
	private Map<String,String> friend;
	
	public MapExample(String name,long mobile,Map<String,String> friend) {
		this.name=name;
		this.mobile=mobile;
		this.friend=friend;
	}
	
	public void display()
	{
		System.out.println(name+" \n"+mobile+" \nMyFriends are");
		Set<Entry<String,String>> set=friend.entrySet();
		
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry <String,String> entry=(Entry<String, String>) itr.next();
			System.out.println("Name : "+entry.getKey()+", Address : "+entry.getValue());
		}
	}

}
