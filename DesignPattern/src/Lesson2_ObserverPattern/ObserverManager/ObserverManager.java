package Lesson2_ObserverPattern.ObserverManager;

import java.util.List;

import Lesson2_ObserverPattern.Observer.Observer;


public interface ObserverManager {
	int findOneObserver(Observer observer); 
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	List<Observer> getAllObserver();
	/**
	 * 
	 * @return 0=>nullList, 1=>List with 0 length, 2=>ready to init
	 */
	Integer checkListInit();
}
