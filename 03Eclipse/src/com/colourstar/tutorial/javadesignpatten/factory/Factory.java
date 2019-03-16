package com.colourstar.tutorial.javadesignpatten.factory;

public class Factory 
{
	public Shape NewShape(String sType)
	{
		if (sType == "Circle")
		{
			return new Circle();
		}
		else if (sType == "Rectangle")
		{
			return new Rectangle();
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		Factory kFactory = new Factory();
		Shape newInstance = kFactory.NewShape("Circle");
		newInstance.Draw();
		newInstance = kFactory.NewShape("Rectangle");
		newInstance.Draw();
	}
}
