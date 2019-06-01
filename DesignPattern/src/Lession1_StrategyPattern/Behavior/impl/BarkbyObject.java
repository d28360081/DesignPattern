package Lession1_StrategyPattern.Behavior.impl;

import Lession1_StrategyPattern.Behavior.BarkBehavior;

public class BarkbyObject implements BarkBehavior{

	@Override
	public void bark() {
		System.out.println("Tony dont run");
	}
}
