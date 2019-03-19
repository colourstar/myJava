package com.colourstar.spring;

import com.colourstar.spring.helloworld.HelloWorlder;
import com.colourstar.spring.helloworld.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProgram 
{
	public static void main(String[] args)
	{
		ApplicationContext kContext = new ClassPathXmlApplicationContext("bean.xml");
		
		HelloWorldService kService = (HelloWorldService)kContext.getBean("helloWorldService");

		HelloWorlder kHandle = kService.getHelloWorld();
		kHandle.SayHello();
	}
}
