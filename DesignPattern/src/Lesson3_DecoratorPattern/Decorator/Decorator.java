package Lesson3_DecoratorPattern.Decorator;

//Decorator interface
public interface Decorator {
	public void setDecorator(Decorator decorator);
	public 	Decorator getDecorator();
	public void decorate();
}
