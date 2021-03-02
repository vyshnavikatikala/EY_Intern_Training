package Lab_1;

import java.util.Scanner;

public class Ex_8 {
	
	public static void main(String[] args) {
		 Index ind = new Index();
		 Scanner scan = new Scanner(System.in);
		 int num;
		 int n = scan.nextInt();
		 int arr[]=new int[n];
		 for(int i = 0; i < n; i++) {
			 arr[i] = scan.nextInt();
		 }
		 System.out.println("Enter the number whose index is to be found: ");
		 num = scan.nextInt();
		 System.out.println("Position of the number is: "+ind.findPosition(n, arr, num));
		 scan.close();
	}
}
	
	class Index{
		int findPosition(int n, int arr[], int num)
		{
			int pos = 0;
			for(int i = 0; i < n; i++)
			{
				if(arr[i] == num)
				    pos = i;
			}
			return pos;
		}
	}
