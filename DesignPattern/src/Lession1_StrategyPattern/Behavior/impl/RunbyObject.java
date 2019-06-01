package Lession1_StrategyPattern.Behavior.impl;

import Lession1_StrategyPattern.Behavior.RunBehavior;

public class RunbyObject implements RunBehavior{

	@Override
	public void run() {
		System.out.println("Tony dont run");
	}

}
