package Lession1_InterfaceModifyDesign;

import Lession1_InterfaceModifyDesign.Animal.impl.BullDog;
import Lession1_InterfaceModifyDesign.Animal.impl.Dogv2;
import Lession1_InterfaceModifyDesign.Animal.impl.ToyDogv2;
import Lession1_InterfaceModifyDesign.Behavior.BarkBehavior;
import Lession1_InterfaceModifyDesign.Behavior.RunBehavior;
import Lession1_InterfaceModifyDesign.Behavior.impl.BarkbyObject;
import Lession1_InterfaceModifyDesign.Behavior.impl.RunbyObject;
import Lession1_InterfaceModifyDesign.Animal.impl.ToyDog;

/**
 * 
 * @Date 2019/06/01
 * @author Mike
 */
public class InterfaceModDesign {
	public static void main(String arg[]) {
		BullDog bullDog=new BullDog();
		ToyDog toyDog=new ToyDog();
		//version1
		bullDog.bark();
		bullDog.run();
		toyDog.bark();
		toyDog.run();
		//version2
		Dogv2 toyDog2=new ToyDogv2();
		BarkBehavior barkBehavior=new BarkbyObject();
		RunBehavior runBehavior=new RunbyObject();
		toyDog2.setBark(barkBehavior);
		toyDog2.setRun(runBehavior);
		toyDog2.barkBehavior();
		toyDog2.runBehavior();
	}
}
