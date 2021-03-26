package labBookDay01;

public class Ex_3 {
	public static void main(String[] args) {
		 int i = 3;
	     float f = 2.2f;
	     double d = 2.3;
	     boolean b = true;
	     char c = 'v';
	     byte by = 23;
	     long li = 20;
	     short s = 12;
	     System.out.println(i);
	     System.out.println(f);
	     System.out.println(d);
	     System.out.println(b);
	     System.out.println(c);
	     System.out.println(by);
	     System.out.println(li);
	     System.out.println(s);
	     d = i;
	     System.out.println("Implicit conversion from int to double: "+d);
	     System.out.println("Explicit conversion from double to int: "+(int)d);
	}
	 
}
