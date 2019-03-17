package com.colourstar.tutorial.javadesignpatten.adapter;

public class MediaPlayer implements MediaInterface
{
	public void Play(String kName)
	{
		if (kName.endsWith(".mp3"))
		{
			System.out.println(String.format("Now play the %s",kName));
		}
		else if (kName.endsWith(".vlc"))
		{
			MediaPlayerAdapter kAdapter = new MediaPlayerAdapter();
			kAdapter.Play_Vlc(kName);
		}
		else if (kName.endsWith(".mp4"))
		{
			MediaPlayerAdapter kAdapter = new MediaPlayerAdapter();
			kAdapter.Play_Mp4(kName);
		}
	}
	
	public static void main(String[] args)
	{
		MediaPlayer kInst = new MediaPlayer();
		kInst.Play("张学友.mp4");
		
		kInst.Play("张学友.vlc");
		kInst.Play("张学友.mp3");
		
	}
}
