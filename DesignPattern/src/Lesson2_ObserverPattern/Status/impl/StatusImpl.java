package Lesson2_ObserverPattern.Status.impl;

import Lesson2_ObserverPattern.Status.Status;

public class StatusImpl implements Status{
private String status;
private final String LISTENING="listening";
private final String BROADCASTING="broadcasting";
	
	public StatusImpl() {
		this.status=LISTENING;
		System.out.println("init Success");
		System.out.println("start listening.....");
	}

	@Override
	public void change() {
		this.status=LISTENING.equals(status)?BROADCASTING:"listening";
		System.out.println(status+".........");
	}
	
}
