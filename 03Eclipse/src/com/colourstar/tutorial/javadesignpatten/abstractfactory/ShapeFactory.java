package com.colourstar.tutorial.javadesignpatten.abstractfactory;

public class ShapeFactory extends AbstractFactory
{
	@Override
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
	
	@Override
	public Color NewColor(String sType)
	{
		return null;
	}
}
