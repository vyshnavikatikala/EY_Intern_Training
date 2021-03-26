package labBookDay04;

public class Qs3 {
     public void mth1() {
    	 mth2();
    	 System.out.println("caller");
     }
     public void mth2() {
    	 try {
    		 //line 1
    		 System.exit(0);  // The program terminates
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println("catch-mth2");
    	 }
    	 finally {
    		 System.out.println("finally-mth2");
    	 }
     }
     
public static void main(String p[]) {
  		 Qs3 q = new Qs3();
   		 q.mth1();
   	 }
}

