package day1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_6{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int N = scan.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter the Elements: ");
		
		for(int i = 0; i < N; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("The length of original array is "+arr.length);
		System.out.println("Enter the new length of the array: ");
		int newN = scan.nextInt();
		arr=Arrays.copyOf(arr, newN);
		System.out.println("The length of modified array is "+arr.length);
		scan.close();
	}
}