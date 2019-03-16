package com.colourstar.tutorial.javadesignpatten.prototype;

public class Main 
{
	public static void main(String[] args)
	{
		Circle inst = new Circle();
		inst.SetID(1);
		
		inst.Draw();
		
		inst = (Circle) inst.clone();
		inst.SetID(2);
		inst.Draw();
	}
}
