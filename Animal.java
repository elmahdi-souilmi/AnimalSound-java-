package com.model;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	private String color;
	private String nutrition;
	private int age;
	public Animal() {
		
	}
    public Animal(String color, String nutrition, int age) {
		this.color = color;
		this.nutrition = nutrition;
		this.age = age;
	}
    
	public void makeSound(String src)throws UnsupportedAudioFileException, IOException, 
	   LineUnavailableException {
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(src));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
	    System.out.println(clip.isActive());
	    
		while(clip.isActive()) {
		}
		clip.close();

}
    
    public void eat() {
    	System.out.println("eat");
    }
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [color=" + color + ", nutrition=" + nutrition + ", age=" + age + "";
	}

	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
    

}
