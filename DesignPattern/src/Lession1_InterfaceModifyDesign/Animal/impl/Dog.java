package Lession1_InterfaceModifyDesign.Animal.impl;

import Lession1_InterfaceModifyDesign.Animal.Animal;

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
