package Lesson3_DecoratorPattern.Decorator.impl;

import Lesson3_DecoratorPattern.Decorator.Decorator;

public class DecoratorSuper implements Decorator{
    protected Decorator decorator;
	public DecoratorSuper() {
		
	}
	public DecoratorSuper(Decorator decorator ) {
		setDecorator(decorator);
	}
	
	public void setDecorator(Decorator decorator) {
		this.decorator=decorator;
	}

	
	public Decorator getDecorator() {
		return decorator;
	}
	
	public void decorate() {
		if(decorator!=null) {
			this.getDecorator().decorate();
		}
	}
}
