package Lesson2_ObserverPattern.Observer.impl;

import Lesson2_ObserverPattern.Observer.Observer;
import Lesson2_ObserverPattern.Subject.Subject;

public class ObserverImpl implements Observer{
private String name;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name= name;
	}

	@Override
	public void update(Subject subject) {
				System.out.println(this.getName()+" been notifed");
	}

}
