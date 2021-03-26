package labBookDay01;

import java.util.Scanner;

public class Ex_20 {
	public static void main(String[] args) {
		int rows, cols;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimensions: ");
		rows = scan.nextInt();
		cols = scan.nextInt();
		int arr[][] = new int[rows][cols];
		int i,j;
		int max;
		for(i = 0; i < rows; i++) {
			System.out.println("Enter values of row "+(i+1));
			for(j = 0; j < cols; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(i = 0; i < rows; i++) {
			max = 0;
			for(j = 0; j < cols; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
			System.out.println("Largest in row "+(i+1)+" is "+max);
		}
	}
}
