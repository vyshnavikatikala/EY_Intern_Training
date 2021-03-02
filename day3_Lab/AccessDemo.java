package day3;

public class AccessDemo {
    public static void main(String[] args) {//starting point of execution by the JVM
		System.out.println("Welcome to JAVA....");//this will output on console
		
	}
}

class ChildTest extends Test{  // sub class same package
       public void ChildMet() {
    	System.out.println(pri); //Not visible
   		System.out.println(nomod);
   		System.out.println(pro);
   		System.out.println(pub);
       }
}

class NonChildTest{  // different(not a sub class)class same package
    public void ChildMet() {
    	Test test=new Test();//creating object //if you don't create the object then nomod,pro,pub wont be visible
 	    System.out.println(test.pri); //Not visible
		System.out.println(test.nomod);
		System.out.println(test.pro);
		System.out.println(test.pub);
    }
}


