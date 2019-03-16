package com.colourstar.tutorial.javadesignpatten.abstractfactory;

public abstract class AbstractFactory 
{
	abstract Shape NewShape(String sType);
	
	abstract Color NewColor(String sType);
}
