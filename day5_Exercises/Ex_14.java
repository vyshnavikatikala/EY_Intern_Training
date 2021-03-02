package day5;

public class Ex_14 {
     public static void main(String[] args) {
    	 int i=0;
    	 if(i) {                              // error - should be a boolean value
    	 System.out.println("Hello");
    	 }
    	 
    	 boolean b=true;
    	 boolean b2=true;
    	 if(b==b2) {
    	 System.out.println("So true");
    	 }
    	 
    	 int i1=1;
    	 int j=2;
    	 if(i==1|| j==2)
    	 System.out.println("OK");
    	 
    	 int i2=1;
    	 int j1=2;
    	 if(i1==1 &| j1==2)                    // error - wrong operator
    	 System.out.println("OK");
	}
}
