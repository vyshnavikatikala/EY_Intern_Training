package day3;

public class MethodDemo {
	int i = 1;
	float f = 1.1f;
	double d = 2.2;
	String s = "Hello";
	char c = 'a';
	boolean b = true;
	
	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();
		obj.met(1,2,3,4,5,6,7);
		String s = obj.met2("world");
		System.out.println(s);
		obj.met(1); //This gets preference
	}
	
   public void met(int... i) { //inputs multiple integers
	   //System.out.println(i); //object
	   // public void aa(){} //Not permitted
	   class A{ //local inner class
		   public void aa() {} //permitted
	   }
	   for(int x:i)
	   {
		   System.out.println(x);
	   }
   }
   
   public void met(int i) {
	
		   System.out.println(i);
	   
   }
   
   public int met1() {
	   return 1;
   }
   public int met1(int i) { //polymorphism //method overloading
	   return 1;
   }
   
   public String met2(String s) {
	   return "Hello"+s;
   }
   public Hello met3() {
	   return new Hello();
   }
}

class Hello{}
