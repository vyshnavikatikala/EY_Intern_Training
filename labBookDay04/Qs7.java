package labBookDay04;

import java.util.Scanner;

public class Qs7 {
   public static void main(String[] args) {
	  int res, numerator, divisor;
	  Scanner scan = new Scanner(System.in);
	  while(true) {
		  numerator = scan.nextInt();
		  divisor = scan.nextInt();
		  if(numerator == 'q' || numerator == 'Q')
			  break;
		  
		  try {
			    res = numerator/divisor;
			    System.out.println(res);
		  }
		 catch(ArithmeticException e) {
			   System.out.println("Please enter a number other than zero... ");
		 }
		  
		 catch(NumberFormatException e) {
			 System.out.println("Please enter a integer value...");
		 }
		  catch(Exception e) {
			  System.out.println(e);
		  }

		  System.out.println("After Exception");
     }
   }
}
