package Lession1_StrategyPattern.Animal.impl;

public class ToyDog extends Dog{
	private String name;
	private String display;
	
	public ToyDog() {
		this.display="like BullDog";
		this.name="BullDog";
	}
	public ToyDog(String display,String name) {
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
		//���㪯���|�s ��...?
		//��ܤ���@
	}

	@Override
	public void run() {
		//���㪯���|�] ��...?
		//��ܤ���@
	}
}
