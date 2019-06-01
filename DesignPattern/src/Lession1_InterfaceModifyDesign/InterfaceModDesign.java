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
 * @Describe	�̪�}�o��, �g�`�J�쭫�ƨϥΪ��Ҳ�, 
 * 				���]���Ȥ᪺�ݨD����ܤƫܤj, �l�Ҳ�(��@���O)�������ϥήt���L�j, 
 * 				�ҥH�ɭP�{���ݭn�ק諸�T�׫ܤj, 
 * 				��O�\�h�ɶ��b�ˬd�P�ץ��W
 * 				�Ʊ��ǥѶ}�o�Ҧ�, �i�H��X��n���ѨM��k
 */
public class InterfaceModDesign {
	public static void main(String arg[]) {
		BullDog bullDog=new BullDog();
		ToyDog toyDog=new ToyDog();
		
		bullDog.bark();
		bullDog.run();
		//���㪯���|�]�]���|�s...
		//���O�ݩ󪯪����O...
		toyDog.bark();
		toyDog.run();
		//�|�o�{��쪺�]�p-->�u�ʤ���
		//����, �i�H��ܱN bark(), run() ��k��X
		//�b��@��Ӥ��� Barkable, DogRunnable ����@���O�B�~��ܬO�_�h��@
		//���O, ���ӧ��{����, �����@�@�ק������@���l��, �N�|��O�۷�h�ɶ��h�ˬd
		
		//�N�欰�A����X �@�����O
		//�H����u�ݭn���μW�[�欰
		Dogv2 toyDog2=new ToyDogv2();
		BarkBehavior barkBehavior=new BarkbyObject();
		RunBehavior runBehavior=new RunbyObject();
		toyDog2.setBark(barkBehavior);
		toyDog2.setRun(runBehavior);
		toyDog2.barkBehavior();
		toyDog2.runBehavior();
	}
}
