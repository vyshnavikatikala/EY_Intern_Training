package labBookDay01;
import java.util.Scanner;

public class Ex_19{
	public static void main(String[] args) {
		int rows, cols;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimensions: ");
		rows = scan.nextInt();
		cols = scan.nextInt();
		int arr[][] = new int[rows][cols];
		int i,j,temp;
		
		for(i = 0; i < rows; i++) {
			System.out.println("Enter values of row "+(i+1));
			for(j=0; j < cols; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(i = 0; i < rows; i++)
		{
			for(j = 0; j < cols/2; j++)
			{
				temp = arr[i][j];
				arr[i][j] = arr[i][cols-j-1];
				arr[i][cols-j-1] = temp; 
			}
		}
		System.out.println("Matrix after Reverse:");
		for(i = 0; i < rows; i++)
		{
			for(j = 0; j < cols; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
