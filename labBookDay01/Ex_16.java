package labBookDay01;

import java.util.Scanner;

public class Ex_16 {
      public static void main(String[] args) {
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("Enter the number of elements: ");
    	  int n = scan.nextInt();
    	  int[] arr = new int[n];
    	  System.out.println("Enter the elements: ");
    	  for(int i = 0; i<n; i++)
    	  {
    		  arr[i]=scan.nextInt();
    	  }
    	  System.out.println("Enter the element to be searched for:");
    	  int search = scan.nextInt();
          Check c = new Check();
          c.locAndCount(n, arr, search);
          scan.close();
	}
}

class Check{
	void locAndCount(int n, int arr[], int search)
	{
		int count = 0;
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == search) {
				System.out.println("Element is present at position "+i);
				count++;
			}
		}
		System.out.println("The element has occured "+count+" times");
	}
}
