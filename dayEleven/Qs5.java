package dayEleven;
import java.util.Scanner;

public class Qs5 {
   public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int i = scan.nextInt();
	   try {
		   if(i == 0) {
			  throw new CustomException("The value cannot be zero");   // unhandled exception
		   } 
	   }
	   finally {
		   System.out.println("Finally block");
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
