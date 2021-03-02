package dayEleven;

import java.util.Scanner;

public class Qs8 {
	public static void main(String[] args) {
		int i=0,total=0;
		Scanner scan = new Scanner(System.in);
		while( i<10 ) {
			try {
				System.out.println("Enter Student "+(i+1)+" mark: ");
				total += Integer.parseInt(scan.next());
				i++;
			}
			catch(NumberFormatException nfe) {
				System.out.println("Please enter only Integer value...");
			}
		}
		System.out.println("Average: "+total/10);
		
	}
}
