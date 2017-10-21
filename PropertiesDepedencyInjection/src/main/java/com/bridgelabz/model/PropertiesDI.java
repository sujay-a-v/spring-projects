package com.bridgelabz.model;

import java.util.Properties;
import java.util.Set;

public class PropertiesDI {
	private Properties driver;
	
	public PropertiesDI(Properties driver) {
		this.driver=driver;
	}
	
	public void display()
	{
		Set set=driver.keySet();
		for(Object obj:set)
		{
			System.out.println(obj+":"+driver.getProperty(obj.toString()));
		}
	}

}
