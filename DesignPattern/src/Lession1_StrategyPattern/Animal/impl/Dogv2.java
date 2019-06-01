package Lession1_StrategyPattern.Animal.impl;

import Lession1_StrategyPattern.Behavior.BarkBehavior;
import Lession1_StrategyPattern.Behavior.RunBehavior;

public abstract class Dogv2 {
	private String display;
	private String name;
	private BarkBehavior bark;
	private RunBehavior run;
	public void barkBehavior() {
		bark.bark();
	}
	public void runBehavior() {
		run.run();
	}
	
	//=========================getter & setter=========================
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BarkBehavior getBark() {
		return bark;
	}
	public void setBark(BarkBehavior bark) {
		this.bark = bark;
	}
	public RunBehavior getRun() {
		return run;
	}
	public void setRun(RunBehavior run) {
		this.run = run;
	}
	
}
