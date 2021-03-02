package day5_Lab;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]=new int[5];
		int []arr2= {2,5,7,9};
		//by default arrays are initialized...
		//by default arrays are pass by value
		//you can use both for loops(old and new)
		//Array is an object so it has properties
		//normally local variables are not initiazlied but arrays are initialized..
		//arrays are strongly typed
		//arrays once declared u cannot change the size.
		//array index always starts with zero
		//in case if you access a wrong index u will get a abnormal condition-ArrayIndexOutOfBoundsException
		//Strongly typed
		//Array picks up memory in a continuous location
		int arr3[][]=new int[4][5];
		int arr4[][]= {
		{4,6,7,7},
		{4,6,7,8}
		};
		//uneven multi dimensional array
		int arr5[][]=new int[3][];
		arr5[0]=new int[2];
		arr5[1]=new int[4];
		arr5[2]=new int[3];
		int arr6[][]= {
		{3,4},
		{5,6,7}
		};
}
}
