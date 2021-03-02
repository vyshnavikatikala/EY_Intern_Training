package day5;

public class Ex_28 {
     public static void main(String[] args) {
    	 String s1=new String("Hello");
         String s2=new String("there");
         String s3=new String();
         s3 = s1 + s2;                             // legal - it does concatenation
         //s3 = s1 - s2;
         //s3 = s1 & s2;
         //s3 = s1 && s2;
         System.out.println(s3);
	}
}
