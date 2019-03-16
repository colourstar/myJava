package com.colourstar.tutorial.javadesignpatten.prototype;

public class Circle extends Shape 
{
	public void Draw()
	{
		System.out.println(String.format("This is Circle,ID is :%d",	 GetID()));
	}
}
