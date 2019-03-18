package com.colourstar.tutorial.javadesignpatten.strategy;

public class AddOperation implements Operation 
{
	@Override
	public int DoOperation(int iNum1,int iNum2)
	{
		return iNum1 + iNum2;
	}
}
