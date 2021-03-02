package day5;

public class Ex_26 {
   public static void main(String[] args) {
	   String s=new String("Bicycle");
	   int iBegin=1;
	   char iEnd=3;
	   System.out.println(s.substring(iBegin,iEnd));
	   /*
	    * substring prints from iBegin to iEnd-1
	    * hence it prints second letter and third letter - ic
	    */
}
}
