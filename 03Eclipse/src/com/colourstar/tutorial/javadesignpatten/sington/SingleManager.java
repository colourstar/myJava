package com.colourstar.tutorial.javadesignpatten.sington;

public class SingleManager 
{
	private static SingleManager kInstance = new SingleManager();
	
	private SingleManager() {};
	
	public static SingleManager getInstance()
	{
		return kInstance;
	}
	
	public void ShowMessage()
	{
		System.out.println("Hello Here is Sington");
	}
}
