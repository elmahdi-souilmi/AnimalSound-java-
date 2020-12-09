package com.model;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AnimalDomestique extends Animal {
	private String benefit;
	
	
	
	
	public AnimalDomestique(String color, String nutrition, int age, String benefit ) {
		super(color, nutrition, age);
		this.benefit = benefit;
	}


	public String getBenefit() {
		return benefit;
	}


	public void setBenefit(String benefit) {
		this.benefit = benefit;
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
		return super.toString() + this.benefit + "]" ;
	}
	

}
