package day03diff; 
import day3.Test; //different package
public class ChildDifPackTest extends Test{ //sub class different package

       public void ChildMet() {
    	System.out.println(pri); //Not visible
   		System.out.println(nomod); //Not visible
   		System.out.println(pro);
   		System.out.println(pub);
       }
}

class NonChildDifPack{
	  public void ChildMet() { //non sub class different package
	    	Test test=new Test();//creating object 
	 	    System.out.println(test.pri); //Not visible
			System.out.println(test.nomod); //Not visible
			System.out.println(test.pro); //Not visible
			System.out.println(test.pub);
	    }
}
