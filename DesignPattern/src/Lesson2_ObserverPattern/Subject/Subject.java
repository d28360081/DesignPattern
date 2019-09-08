package Lesson2_ObserverPattern.Subject;

import Lesson2_ObserverPattern.Observer.Observer;

/**
 * 
 * @author USER
 *
 */

public interface Subject {
	void changeStatus();
	void notifyObserver(Observer observer);
	void notifyAllObserver();
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
}
