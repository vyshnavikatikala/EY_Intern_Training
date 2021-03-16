package day11;
class Base extends Exception {
	public Base() throws Exception {
		throw new Exception();
	}
} 

class Derived extends Base  {

//  Default constructor cannot handle exception type Exception thrown by 
//  implicit super constructor. Must define an explicit constructor

	public Derived() throws Exception {
		super();
		
	}

  }

public class Qs6 { 
public static void main(String args[]) { 
  try { 
     throw new Derived(); 
  } 
  catch(Derived d) {System.out.println("derived catch");}
  catch(Base b) {System.out.println("base catch");}
  catch(Exception e) {System.out.println("general exception catch");}
} 
}
