package Lession1_StrategyPattern.Animal.impl;

import Lession1_StrategyPattern.Animal.Animal;

public abstract class Dog implements Animal{
	private String display;
	private String name;
	public void setDisplay(String display) {
		this.display=display;
	}
	public void setName(String name) {
		this.name=name;
	}
	public abstract void bark();
	public abstract void run();
}
