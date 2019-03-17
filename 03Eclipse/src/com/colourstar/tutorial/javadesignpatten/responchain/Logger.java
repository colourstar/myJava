package com.colourstar.tutorial.javadesignpatten.responchain;

public abstract class Logger 
{
	private int 				m_iLevel;
	protected Logger 	m_kNextLogger;
	
	Logger(int iLevel)
	{
		m_iLevel = iLevel;
		m_kNextLogger = null;
	}
	
	public int 			GetLevel()
	{
		return m_iLevel;
	}
	
	public void 		SetNextLog(Logger nextLogger)
	{
		m_kNextLogger = nextLogger;
	}
	
	public void Write(String message)
	{
		switch (GetLevel())
		{
		case 1:
			System.out.println("Info output:" + message);
			break;
		case 2:
			System.out.println("Warnning output:" + message);
			break;
		case 3:
			System.out.println("Error output:" + message);
			break;
		default:
			break;
		}
		
		if (m_kNextLogger != null) 
		{
			m_kNextLogger.Write(message);
		}
	}
}
