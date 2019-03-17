package com.colourstar.tutorial.javadesignpatten.adapter;

public class MediaPlayerAdapter implements AdvanceMediaInterface 
{
	public void Play_Vlc(String kName)
	{
		System.out.println(String.format("Now Play the %s", kName));
	}
	
	public void Play_Mp4(String kName)
	{
		System.out.println(String.format("Now Play the %s", kName));
	}
}
