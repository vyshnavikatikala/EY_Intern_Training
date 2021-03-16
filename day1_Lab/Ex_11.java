package day1_Lab;

import java.util.Scanner;

public class Ex_11 {
     
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int i, j, num = 1;
	   	    System.out.println("Enter the dimension of the matrix: ");
	   	    int rows, cols;
	   	    rows = scan.nextInt();
			cols = scan.nextInt();
			
	   	    System.out.println("The Resultant Matrix is: ");
	   	    
			int arr[][] = new int[rows][cols];
			for(i=0;i<rows;i++) {
				for(j=0;j<=i;j++) {
					arr[i][j] = num++;
				}
			}
			for(i=0;i<rows;i++) {
				for(j=0;j<=i;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}
}
