package com.colourstar.tutorial.javadesignpatten.criteria;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria 
{
	public List<Persion> meetCriteria(List<Persion> kPersionList)
	{
		List<Persion> kRet = new ArrayList<Persion>();
		for (Persion persion : kPersionList)
		{
			if (persion.GetSex().equalsIgnoreCase("MALE"))
			{
				kRet.add(persion);
			}
		} 
		
		return kRet;
	}
}
