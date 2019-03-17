package com.colourstar.tutorial.javadesignpatten.bridge;

public abstract class Shape 
{
	protected Drawable m_DrawAPI;

	Shape(Drawable dm)
	{
		this.m_DrawAPI = dm;
	}
	
	public void Draw()
	{
		m_DrawAPI.Draw();
	}
}
