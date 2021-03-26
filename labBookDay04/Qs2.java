package labBookDay04;

public class Qs2 {
     public void mth1() {
    	 mth2();
    	 System.out.println("caller");
     }
     public void mth2() {
    	 try {
    		 //line 1
    		 int i = 1/0;
    		 return;
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
  		 Qs2 q = new Qs2();
   		 q.mth1();
   	 }
}
