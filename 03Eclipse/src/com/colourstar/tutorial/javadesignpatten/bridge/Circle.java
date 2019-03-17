package com.colourstar.tutorial.javadesignpatten.bridge;

public class Circle extends Shape
{
	Circle(Drawable dm)
	{
		super(dm);
	}
	
	public static void main(String[] args)
	{
		Circle kInst1 = new Circle(new RedDraw());
		kInst1.Draw();
		Circle kInst2 = new Circle(new BlueDraw());
		kInst2.Draw();
	}
}
