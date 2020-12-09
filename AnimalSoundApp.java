package com.model;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AnimalSoundApp {
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Rhino bob = new Rhino();
		bob.addRhino();
		System.out.println("hello im a "+bob.getCategory()+" rihno and i eat "+bob.getNutrition()+" !!!");
		bob.makeSound(bob.getMySound());

	}

}
