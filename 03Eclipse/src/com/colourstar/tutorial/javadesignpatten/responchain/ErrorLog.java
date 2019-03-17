package com.colourstar.tutorial.javadesignpatten.responchain;

public class ErrorLog extends Logger 
{
	ErrorLog()
	{
		super(3);
	}
	
	public static void main(String[] args)
	{
		InfoLog kInfoLog = new InfoLog();
		WarningLog kWarningLog = new WarningLog();
		ErrorLog kErrorLog = new ErrorLog();
		
		kInfoLog.SetNextLog(kWarningLog);
		kWarningLog.SetNextLog(kErrorLog);
		
		kInfoLog.Write("Hello chain");
	}
}
