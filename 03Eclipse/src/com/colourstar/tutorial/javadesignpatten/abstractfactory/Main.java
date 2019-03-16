package com.colourstar.tutorial.javadesignpatten.abstractfactory;

public class Main 
{
	public static AbstractFactory GetFactory(String sType)
	{
		if (sType == "Shape")
		{
			return new ShapeFactory();
		}
		else if (sType == "Color")
		{
			return new ColorFactory();
		}
		return null;
	}
	public static void main(String[] args)
	{
		AbstractFactory kShapeFactory = GetFactory("Shape");
		AbstractFactory kColorFactory = GetFactory("Color");
		
		Shape kCircle = kShapeFactory.NewShape("Circle");
		Shape kRectange = kShapeFactory.NewShape("Rectangle");
		
		kCircle.Draw();
		kRectange.Draw();
		
		Color kRed = kColorFactory.NewColor("Red");
		Color kBlue = kColorFactory.NewColor("Blue");
		kRed.Fill();
		kBlue.Fill();
	}
}
