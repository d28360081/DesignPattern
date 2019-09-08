package Lesson2_ObserverPattern.ObserverManager.impl;

import java.util.ArrayList;
import java.util.List;

import Lesson2_ObserverPattern.Observer.Observer;
import Lesson2_ObserverPattern.ObserverManager.ObserverManager;



public class ObserverManagerImpl implements ObserverManager{
	private List<Observer> observerList;
	
	public ObserverManagerImpl(){
		observerList=new ArrayList<Observer>();
	}

	@Override
	public int findOneObserver(Observer observer) {
		if(checkListInit()==2) {
				for(int i=0;i<observerList.size();i++) {
					Observer ob=observerList.get(i);
					if(ob.getName().equals(observer.getClass())) {
						return i;
					}
				}
		}
		return -1;		
	}

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index=-1;
		if((index=findOneObserver(observer))!=-1) {
			observerList.remove(index);
		}
	}

	@Override
	public Integer checkListInit() {
		return (observerList.size()==0)?1:2;
	}

	@Override
	public List<Observer> getAllObserver() {
		return observerList;
	}
	

}
