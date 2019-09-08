package Lesson2_ObserverPattern.Subject.impl;

import Lesson2_ObserverPattern.ObserverManager.ObserverManager;
import Lesson2_ObserverPattern.ObserverManager.impl.ObserverManagerImpl;
import Lesson2_ObserverPattern.Status.Status;
import Lesson2_ObserverPattern.Status.impl.StatusImpl;
import Lesson2_ObserverPattern.Subject.Subject;

public abstract class SubjectSuper implements Subject{
	protected ObserverManager observerManager;
	protected Status status;
	
	public SubjectSuper() {
		observerManager=new ObserverManagerImpl();
		status=new StatusImpl();
	}
}
