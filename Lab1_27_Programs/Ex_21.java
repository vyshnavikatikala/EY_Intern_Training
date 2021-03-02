package Lab_1;
import java.util.Scanner;

public class Ex_21{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int year;
		String month = "";
		System.out.println("Enter the Year: ");
		year=scan.nextInt();
		System.out.println("Enter the Month:");
		month=scan.next();
		switch(month)
		{
		   case "January":   System.out.println("No of days is 31"); 
		                     break;
		   
		   case "February":   if((year%400==0) || (year%4==0 && year%100!=0))
			                      {
				                      System.out.println("January has 29 days in this year");
			                      }
			                  else 
			                      {
				                      System.out.println("January has 28 days in this year");
			                      }
			                  break;
		  
		   case "March":     System.out.println("March has 31 days in this year");
		                     break;
		   case "April":     System.out.println("April has 30 days in this year"); 
		                     break;
		   case "May":       System.out.println("May has 31 days in this year"); 
		                     break;
		   case "June":      System.out.println("June has 30 days in this year");
		                     break;
		   case "July":      System.out.println("July has 31 days in this year");
		                     break;
		   case "August":    System.out.println("August has 31 days in this year"); 
		                     break;
		   case "September": System.out.println("September has 30 days in this year");
		                     break;
		   case "October":   System.out.println("October has 31 days in this year");
		                     break;
		   case "November":  System.out.println("Novermber has 30 days in this year");
		                     break;
		   case "December":  System.out.println("December has 31 days in this year");
		                     break;
		   default:          System.out.println("Invalid");
		}
		   scan.close();
	}
}
