package com.colourstar.tutorial.javadesignpatten.prototype;

public abstract class Shape implements Cloneable 
{
	private String m_Name;
	private int m_ID;
	
	abstract void Draw();
	
	public int GetID()
	{
		return m_ID;
	}
	
	public void SetID(int iID)
	{
		m_ID = iID;
	}
	
	public String GetName()
	{
		return m_Name;
	}
	
	public Object clone()
	{
		Object cloneInst = null;
		try
		{
			cloneInst = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return cloneInst;
	}
}
