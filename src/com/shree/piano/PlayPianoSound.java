package com.shree.piano;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayPianoSound {

	public PlayPianoSound(File sound)
	{
		try	
		{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/10000);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
