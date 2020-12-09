package com.model;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Rhino extends AnimalSauvage {
	private String category;
	private String mySound = "C:\\Users\\Admin\\Desktop\\sounds\\rhinos5.wav";
	
	public String getMySound() {
		return mySound;
	}

	public Rhino() {}
	public void addRhino() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rhino Color :");
		String color = scanner.next();
		System.out.println("Rhino Nutrition :");
		String nutrition = scanner.next();
		System.out.println("Rhino Age :");
		int age = scanner.nextInt();
		System.out.println("Rhino Comportement :");
		String comportement = scanner.next();
		System.out.println("Rhino Category :");
		String category = scanner.next();
		this.setColor(color);
		this.setNutrition(nutrition);
		this.setAge(age);
		this.setComportement(comportement);
		this.setCategory(category);
	}
	public Rhino(String color, String nutrition, int age, String comportement, String category ) {
		super(color, nutrition, age, comportement);
		this.category = category;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public void makeSound(String src) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		super.makeSound(src);
}
	

	@Override
	public void eat() {
		super.eat();
	}
	@Override
	public String toString() {
		return super.toString() + this.category + "]" ;
	}
	
	
	

}
