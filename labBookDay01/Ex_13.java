package labBookDay01;

import java.util.Scanner;

public class Ex_13 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int student = scan.nextInt();
		int mark = scan.nextInt();
		int marks[][] = new int[student][mark];
		
		for(int i=0; i < student; i++) {
			for(int j=0; j < mark; j++) {
				marks[i][j] = scan.nextInt();
			}
		}
		
		Marks obj = new Marks();
		obj.calculateResult(marks, student, mark);
		scan.close();
		
	}
}

class Marks {
	void calculateResult(int marks[][], int student, int mark) {
		int sum, avg;
		for(int i=0; i<student; i++) {
			sum=0; avg=0;
			for(int j=0; j<mark; j++) {
				sum = sum + marks[i][j];
			}
			avg = sum/mark;
			System.out.println("Total Marks of Student "+(i+1)+": "+sum);
			System.out.println("Average of Student "+(i+1)+": "+avg);
		}
	}
}