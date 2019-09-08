package Lesson2_ObserverPattern.Subject.impl;


import Lesson2_ObserverPattern.Observer.Observer;


public class SubjectImpl extends SubjectSuper{
	
	@Override
	public void addObserver(Observer observer) {
		observerManager.addObserver(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) throws RuntimeException{
		try {
		if(observer==null) {
			throw new RuntimeException("input observer is null");
		}			
		observerManager.removeObserver(observer);
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void notifyObserver(Observer observer) {
		if(observerManager.checkListInit()>0) {
			int i=observerManager.findOneObserver(observer);
			observerManager.getAllObserver().get(i).update(this);			
		}
		status.change();
	}

	@Override
	public void notifyAllObserver() {
		for(Observer ob:observerManager.getAllObserver()) {
			ob.update(this);
		}
		status.change();
	}

	@Override
	public void changeStatus() {
		status.change();
		notifyAllObserver();
	}
}
