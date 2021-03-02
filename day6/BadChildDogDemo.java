package day6;

import java.util.Scanner;

public class BadChildDogDemo {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a item : ");
		String item=scan.next();
		NaughtyChild baby = ChildDogContainer.getNaughtyChild(item);
		baby.playWithDog();
	}
}

class ChildDogContainer{
	public static NaughtyChild getNaughtyChild(String inp) throws Exception {
		NaughtyChild baby=new NaughtyChild();
		BullDogItem item = (BullDogItem)Class.forName("day6."+inp).newInstance();
		baby.dogItem = item;
		
		return baby;

	}
}

//class BullDog{
//	public void play(String item) {
//		if(item.equals("stick")) {
//			System.out.println("you beat I bite......");
//		}
//		else if(item.equals("stone")) {
//			System.out.println("you hit I bark.....");
//		}
//	}
//}

class NaughtyChild{
	BullDogItem dogItem;
	public void playWithDog() {
		dogItem.play();
	}
}

abstract class BullDogItem {
	public abstract void play();
}

class Stick extends BullDogItem {
	@Override
	public void play() {
		System.out.println("you beat I bite.....");
		
	}
}

class Stone extends BullDogItem {
	@Override
	public void play() {
		System.out.println("you hit I bark.....");
		
	}
}