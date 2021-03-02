package Lab_1;

import java.util.Scanner;

public class Ex_10 {
     public static void main(String[] args) {
    	 
   	    Scanner scan = new Scanner(System.in);
   	    int i, j, num = 1;
   	    System.out.println("Enter the dimension of the matrix: ");
   	    int rows, cols;
   	    rows = scan.nextInt();
		cols = scan.nextInt();
		int arr[][] = new int[rows][cols];
		
   	    System.out.println("The Resultant Matrix is: ");
   	    
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				arr[i][j] = num++;
			}
		}
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

