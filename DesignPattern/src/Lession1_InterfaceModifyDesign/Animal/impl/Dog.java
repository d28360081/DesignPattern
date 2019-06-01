package Lession1_InterfaceModifyDesign.Animal.impl;

import Lession1_InterfaceModifyDesign.Animal.Animal;

public abstract class Dog implements Animal{
	private String display;
	private String name;
	//子類實作Animal 的方法
	public void setDisplay(String display) {
		this.display=display;
	}
	public void setName(String name) {
		this.name=name;
	}
	//額外加入狗類別會有的行為
	public abstract void bark();
	public abstract void run();
}
