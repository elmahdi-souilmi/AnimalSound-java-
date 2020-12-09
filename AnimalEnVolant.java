package com.model;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AnimalEnVolant extends Animal {

	  private int WingsLenght;
	  


	public AnimalEnVolant(String color, String nutrition, int age, int WingsLenght) {
		super(color, nutrition, age);
		this.WingsLenght = WingsLenght;
	}


	public int getWingsLenght() {
		return WingsLenght;
	}


	public void setWingsLenght(int wingsLenght) {
		WingsLenght = wingsLenght;
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
			return super.toString() + this.WingsLenght + "]" ;
		}
		

	


}
