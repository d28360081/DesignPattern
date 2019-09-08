package Lesson2_ObserverPattern.Observer;

import Lesson2_ObserverPattern.Subject.Subject;

public interface Observer {
	void setName(String name);
	String getName();
	void update(Subject subject);
}
