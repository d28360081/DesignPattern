package Lession1_StrategyPattern.Animal.impl;

public class BullDog extends Dog{
	private String name;
	private String display;
	
	public BullDog() {
		this.display="like BullDog";
		this.name="BullDog";
	}
	public BullDog(String display,String name) {
		this.name=name;
		this.display=display;
	}

	@Override
	public void display() {	
		System.out.println(this.display);
	}

	@Override
	public void name() {
		System.out.println(this.name);
	}

	@Override
	public void bark() {
		System.out.println("BullDog woof");
	}

	@Override
	public void run() {
		System.out.println("BullDog Run");
	}
}
