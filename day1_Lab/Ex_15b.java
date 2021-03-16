package day1_Lab;

import java.util.Scanner;
import java.lang.Math;

public class Ex_15b {
       public static void main(String[] args) {
    	   Scanner scan = new Scanner(System.in);
    	   int num;
    	   num = scan.nextInt();
    	   Armstrong obj1 = new Armstrong();
    	   PerfectNumber obj2 = new  PerfectNumber();
    	   Palindrome obj3 = new Palindrome();
    	   
    	   if (obj1.isArmstrong(num)) {
    		    System.out.println(num+" is Armstrong number");  
    	   }
    	   if (obj2.isPerfectNumber(num)) {
    		   System.out.println(num+" is Perfect number");  
    	   }
    	   if(obj3.isPalindrome(num)) {
    		   System.out.println(num+" is a Palindrome");  
    	   }
    	   if(obj1.isArmstrong(num)==false && obj2.isPerfectNumber(num)==false && obj3.isPalindrome(num)==false)
    	   {
    		   System.out.println(num+" is neither Armstrong nor perfect nor palindrome");
    	   }
    	   scan.close();
	}
}

class Armstrong{
	boolean isArmstrong(int num) {
           int n1 = num;
           double x, sum = 0,count = 0;
           while(n1 > 0)
           {
        	   n1 = n1 / 10;
        	   count ++;
           }
           int n = num ;
           while(n > 0) {
        	   x = n % 10;
               sum = sum + (Math.pow(x,count));
               n = n / 10;
           }
       if(sum == num)
    	  return true;
       else
    	   return false;
	}
}

class PerfectNumber{
	boolean isPerfectNumber(int num) {
		int sum = 0;
		for ( int i = 1; i <= num/2 ; i++)
		{
			if(num % i == 0)
			{
				sum+=i; 
			}
		}
		if (sum == num)
			return true;
		else
			return false;
	}
}

class Palindrome{
	boolean isPalindrome(int num) {
		int n = num;
		int a,rev=0;
		while(n>0)
		{
			a = n % 10;
			rev = (rev*10) + a;
			n = n/10;
		}
		if(rev == num)
			return true;
		else
			return false;
	}
}