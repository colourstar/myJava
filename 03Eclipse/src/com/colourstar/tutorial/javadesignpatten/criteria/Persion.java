package com.colourstar.tutorial.javadesignpatten.criteria;

import java.util.ArrayList;
import java.util.List;

public class Persion 
{
	private String m_kName;
	private String m_kSex;
	private String m_kStatus;
	
	Persion(String kName,String kSex, String kStatus)
	{
		m_kName = kName;
		m_kSex = kSex;
		m_kStatus = kStatus;
	}

	public String GetName()
	{
		return m_kName;
	}
	
	public String GetSex()
	{
		return m_kSex;
	}
	
	public String GetStatus()
	{
		return m_kStatus;
	}
	
	public static void main(String[] args)
	{
		List<Persion> akList = new ArrayList<Persion>();
		akList.add( new Persion("Zhangsan","Male","111") );
		akList.add( new Persion("LiNa","FeMale","111") );
		
		FemaleCriteria kCriteria = new FemaleCriteria();
		akList = kCriteria.meetCriteria(akList);
		
		for (Persion persion : akList)
		{
			System.out.println(String.format("This man is %s,Sex is %s,Status is %s",persion.GetName(),persion.GetSex(),persion.GetStatus()));
		}
	}
}
