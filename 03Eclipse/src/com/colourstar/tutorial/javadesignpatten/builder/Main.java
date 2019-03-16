package com.colourstar.tutorial.javadesignpatten.builder;


class Humberger implements Item
{
	public String Name()
	{
		return "Humberger";
	}
	
	public Pack PackInst()
	{
		return new Wrapper();
	}
	
	public float Price()
	{
		return 10.0f;
	}
}

class Coke implements Item
{
	public String Name()
	{
		return "Coke";
	}
	
	public Pack PackInst()
	{
		return new Bottle();
	}
	
	public float Price()
	{
		return 5.0f;
	}
}


public class Main 
{
	public static void main(String[] args)
	{
		Humberger kHumberger = new Humberger();
		System.out.println(String.format("item is %s,pack way : %s,price is :%.1f",	kHumberger.Name(),kHumberger.PackInst().Packing(),kHumberger.Price()));
		
		Coke kCoke = new Coke();
		System.out.println(String.format("item is %s,pack way : %s,price is :%.1f",	kCoke.Name(),kCoke.PackInst().Packing(),kCoke.Price()));
	}
}
