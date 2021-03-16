package day11;
import java.util.Scanner;

public class Qs4 {
   public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int i = scan.nextInt();
	   try {
		   if(i == 0) {
			  throw new CustomException("The value cannot be zero");   
		   } 
	   }
	   catch(Exception e){
		   System.out.println(e);
	   }
	   System.out.println("After Exception");
}
}

class CustomException extends Exception{
	String msg;
	public CustomException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
	
}
