package com.colourstar.tutorial.javadesignpatten.abstractfactory;

public class ColorFactory extends AbstractFactory
{
	@Override
	public Shape NewShape(String sType)
	{
		return null;
	}
	
	@Override
	public Color NewColor(String sType)
	{
		if (sType == "Red")
		{
			return new Red();
		}
		else if (sType == "Blue")
		{
			return new Blue();
		}
		return null;
	}
}
