package com.colourstar.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_jdbc.xml");
		StudentDAOImp kImp = (StudentDAOImp)context.getBean("customerDAO");
		Student kStudent = new Student();
		kStudent.m_iAge = 29;
		kStudent.m_iID = 2;
		kStudent.m_kName = "color";
		kImp.InsertStudent(kStudent);
		
		Student kStudent1 = kImp.GetStudent(1);
		System.out.println(kStudent1.m_iID);
		System.out.println(kStudent1.m_iAge);
		System.out.println(kStudent1.m_kName);
		System.out.println(kStudent1);
				
	}
}
