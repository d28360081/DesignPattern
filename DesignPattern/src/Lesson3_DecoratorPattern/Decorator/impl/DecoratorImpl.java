package Lesson3_DecoratorPattern.Decorator.impl;

import Lesson3_DecoratorPattern.Decorator.Decorator;

public class DecoratorImpl extends DecoratorSuper{
	//Impl class custom prop
	private String name;
	
	public DecoratorImpl(Decorator decorator) {
		this.decorator=decorator;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	
	@Override
	public void setDecorator(Decorator decorator) {
		super.setDecorator(decorator);
	}

	@Override
	public Decorator getDecorator() {
		return super.getDecorator();
	}	
	
	public void decorate() {
		this.printImpl();
		super.decorate();
	}
	//custom method 
	public void printImpl() {
		System.out.println("decorate from :"+this.getName());
	}
}
