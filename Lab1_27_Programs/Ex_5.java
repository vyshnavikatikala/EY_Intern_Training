package Lab_1;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
    	Scanner obj = new Scanner(System.in);
    	int n;
    	n = obj.nextInt();
    	int arr[]=new int[n];
    	for (int i = 0; i<n ; i++)
    	{
    		arr[i] = obj.nextInt();
    	}
    	Average a = new Average();
    	float result = a.findAverage(n, arr);
    	System.out.println("The average is "+result);
    	obj.close();
    }
 }
  	
 class Average{
     float findAverage(int n, int arr[])
     {
    	float avg;
    	int i, sum = 0;
    	for (i = 0; i < n; i++)
    	{
             sum = sum + arr[i];    		
    	}
    	avg = sum/n;
    	return avg;
     }
 }
    	
    	
	