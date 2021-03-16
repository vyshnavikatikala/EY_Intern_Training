package day1_Lab;

import java.lang.Math;
import java.util.Scanner;

public class Ex_4 {
     public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		int num, flag;
		num = scan.nextInt();
		Prime obj = new Prime();
		flag = obj.checkPrime(num);
		if (flag == 1)
		{
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println(num+" is a prime number");
		}
		scan.close();
     }
}
     
  class Prime
   { 
	  public int checkPrime(int num)
	  {
		     int flag = 0, i;
	    	 for (i = 2 ; i <= Math.sqrt(num) ; i++)
	 		{
	 			if ( num % i == 0 )
	 			{
	 				flag = 1;
	 				break;
	 			}
	 		}
	     return flag;
	  }
   }
