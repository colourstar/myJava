package com.colourstar.tutorial.javadesignpatten.sington;

public class Main 
{
	public static void main(String[] args)
	{
		SingleManager kInstance = SingleManager.getInstance();
		
		kInstance.ShowMessage();
	}
}
