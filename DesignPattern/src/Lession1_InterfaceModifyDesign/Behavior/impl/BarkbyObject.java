package Lession1_InterfaceModifyDesign.Behavior.impl;

import Lession1_InterfaceModifyDesign.Behavior.BarkBehavior;

public class BarkbyObject implements BarkBehavior{

	@Override
	public void bark() {
		System.out.println("Tony dont run");
	}
}
