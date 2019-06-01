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
 * @Describe	最近開發時, 經常遇到重複使用的模組, 
 * 				但因為客戶的需求更改變化很大, 子模組(實作類別)彼此的使用差異過大, 
 * 				所以導致程式需要修改的幅度很大, 
 * 				花費許多時間在檢查與修正上
 * 				希望藉由開發模式, 可以找出更好的解決辦法
 */
public class InterfaceModDesign {
	public static void main(String arg[]) {
		BullDog bullDog=new BullDog();
		ToyDog toyDog=new ToyDog();
		
		bullDog.bark();
		bullDog.run();
		//玩具狗不會跑也不會叫...
		//但是屬於狗的類別...
		toyDog.bark();
		toyDog.run();
		//會發現當初的設計-->彈性不足
		//此時, 可以選擇將 bark(), run() 方法抽出
		//在實作兩個介面 Barkable, DogRunnable 讓實作類別額外選擇是否去實作
		//但是, 未來更改程式時, 必須一一修改全部實作的子類, 將會花費相當多時間去檢查
		
		//將行為再次抽出 作為類別
		//以後更改只需要更改或增加行為
		Dogv2 toyDog2=new ToyDogv2();
		BarkBehavior barkBehavior=new BarkbyObject();
		RunBehavior runBehavior=new RunbyObject();
		toyDog2.setBark(barkBehavior);
		toyDog2.setRun(runBehavior);
		toyDog2.barkBehavior();
		toyDog2.runBehavior();
	}
}
