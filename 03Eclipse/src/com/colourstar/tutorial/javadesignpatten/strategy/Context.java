package com.colourstar.tutorial.javadesignpatten.strategy;

public class Context 
{
	private Operation m_kOper;

	public void SetOper(Operation kOper)
	{
		m_kOper = kOper;
	}
	
	public int ExecuteStrategy(int iNum1, int iNum2)
	{
		return m_kOper.DoOperation(iNum1, iNum2);
	}
	
	public static void main(String[] args)
	{
		Context kInst = new Context();
		kInst.SetOper(new AddOperation());
		
		System.out.println(kInst.ExecuteStrategy(1, 2));
	}
}
