package Lesson2_ObserverPattern;

import Lesson2_ObserverPattern.Observer.Observer;
import Lesson2_ObserverPattern.Observer.impl.ObserverImpl;
import Lesson2_ObserverPattern.Subject.Subject;
import Lesson2_ObserverPattern.Subject.impl.SubjectImpl;

/**
 * Observer Pattern
 * @author USER
 *
 */
public class ObserverPattern {
	public static void main(String args[]) {
		Subject subject=new SubjectImpl();
		Observer ob=new ObserverImpl();
		ob.setName("observer1");
		subject.addObserver(ob);
		subject.changeStatus();
	}
}
