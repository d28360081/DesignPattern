package Lession1_InterfaceModifyDesign.Animal.impl;

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
		//玩具狗不會叫 那...?
		//選擇不實作
	}

	@Override
	public void run() {
		//玩具狗不會跑 那...?
		//選擇不實作
	}
}
