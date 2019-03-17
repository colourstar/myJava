package com.colourstar.tutorial.javadesignpatten.facade;

public class ShapeMaker 
{
	private Shape m_kRectangle;
	private Shape m_kCircle;
	
	ShapeMaker()
	{
		m_kRectangle = new Rectangle();
		m_kCircle = new Circle();
	}
	public void DrawCircle()
	{
		m_kCircle.Draw();
	}
	
	public void DrawRectangle()
	{
		m_kRectangle.Draw();
	}
	
	public static void main(String[] args)
	{
		ShapeMaker kMaker = new ShapeMaker();
		
		kMaker.DrawCircle();
		
		kMaker.DrawRectangle();
	}
}
