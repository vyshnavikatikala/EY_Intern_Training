package labBookDay04;

import java.util.Scanner;

public class Qs9 {
	public static void main(String[] args) throws Exception{
		int i = 0, total = 0, m;
		Scanner scan = new Scanner(System.in);
		while( i<10 ) {
			try {
				System.out.println("Enter Student "+(i+1)+" mark: ");
				m = Integer.parseInt(scan.next());
				if(m<0)
					throw new CustomException("You entered a negative Value, Please Enter only positive Integer...");
				if(m>100)
					throw new CustomException("Entered value is Out of Range, Please Enter values in the range 0-100.... ");
				total = total + m;
				i++;
			}
			catch(NumberFormatException nfe) {
				System.out.println("Please enter Integer value only...");
			}
			catch(CustomException ce) {
				System.out.println(ce);
			}
		}
		System.out.println("Average: "+total/10);
	}
}


class CustomException extends Exception {
	String msg;
	public CustomException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Exception: "+msg;
	}
}
