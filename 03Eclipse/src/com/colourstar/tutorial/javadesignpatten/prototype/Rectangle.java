package com.colourstar.tutorial.javadesignpatten.prototype;

public class Rectangle extends Shape
{
	public void Draw()
	{
		System.out.println(String.format("This is Rectange,ID is :%d", GetID()));
	}
}
