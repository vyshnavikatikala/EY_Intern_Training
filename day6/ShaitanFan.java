package day6;
import java.util.Scanner;
public class ShaitanFan {
	public static void main(String[] args) {
		//BadFan shaitan=new BadFan();
		GoodFan khaitan = new GoodFan();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Please enter to call pull method....");
			scan.next();
			//shaitan.pull();
			khaitan.pull();
		}
	}
}
class BadFan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state....");
			state=1;
		}
		else if(state==1) {
			System.out.println("medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("high speed state...");
			state=3;
		}
		else if(state==3) {
			System.out.println("switch off state...");
			state=0;
		}
	}
}
