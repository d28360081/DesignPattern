package Lession1_InterfaceModifyDesign.Animal.impl;

import Lession1_InterfaceModifyDesign.Animal.Animal;

public abstract class Dog implements Animal{
	private String display;
	private String name;
	//�l����@Animal ����k
	public void setDisplay(String display) {
		this.display=display;
	}
	public void setName(String name) {
		this.name=name;
	}
	//�B�~�[�J�����O�|�����欰
	public abstract void bark();
	public abstract void run();
}
