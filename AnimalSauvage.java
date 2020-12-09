package com.model;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AnimalSauvage extends Animal {
	private String comportement;
	public AnimalSauvage() {
		
	}
	public String getComportement() {
		return comportement;
	}


	public AnimalSauvage(String color, String nutrition, int age, String comportement ) {
		super(color, nutrition, age);
		this.comportement = comportement;
	}


	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

	@Override
	public void makeSound(String src) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		super.makeSound(src);
	}

	@Override
	public void eat() {
		super.eat();
	}
	@Override
	public String toString() {
		return super.toString() + this.comportement + "]" ;
	}
	

}
