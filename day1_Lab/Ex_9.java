package day1_Lab;

import java.util.Scanner;

public class Ex_9 {
      public static void main(String[] args) {
    	  Reverse rev = new Reverse();
    	  Scanner scan = new Scanner(System.in);
    	  int n;
    	  n = scan.nextInt();
    	  int arr1[]=new int[n];
    	  for(int i = 0; i < n; i++) {
 			 arr1[i] = scan.nextInt();
 		 }
    	  System.out.println("The Original array is: ");
    	  for(int i = 0; i < n; i++) {
    		  System.out.print(arr1[i]+" ");
  		 }
    	 rev.reverse(n, arr1);
    	 scan.close();
	}
}

class Reverse{
	void reverse(int n1, int arr1[]) {
		int arr2[] = new int[n1];
		int n2 = n1;
		for(int i = 0; i < n1; i++) {
			arr2[n2 - 1] = arr1[i];
			n2--;
		}
		System.out.println("\nThe reversed array is: ");    
		for(int i = 0; i < n1; i++) {
			 System.out.print(arr2[i]+" ");    
		}
	}
}
