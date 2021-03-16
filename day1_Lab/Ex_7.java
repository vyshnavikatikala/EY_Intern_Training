package day1_Lab;

import java.util.Scanner;

public class Ex_7 {
	public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
	int [] arr = new int [n];    
	for (int i = 0; i<n ; i++)
	{
		arr[i] = obj.nextInt();
	}
    int temp = 0;    
        
    System.out.println("Elements of original array: ");    
    for (int i = 0; i < arr.length; i++) {     
        System.out.print(arr[i] + " ");    
    }    
        
    //Sorting in ascending order    
    for (int i = 0; i < arr.length; i++) {     
        for (int j = i+1; j < arr.length; j++) {     
           if(arr[i] > arr[j]) {    
               temp = arr[i];    
               arr[i] = arr[j];    
               arr[j] = temp;    
           }     
        }     
    }    
      
    System.out.println();    
        
    //Displaying elements of array after sorting    
    System.out.println("Elements of array sorted in ascending order: ");    
    for (int i = 0; i < arr.length; i++) {     
        System.out.print(arr[i] + " ");    
    }    
    obj.close();
  }
}