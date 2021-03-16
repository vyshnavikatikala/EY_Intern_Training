package day1_Lab;

public class Ex_17b {
	
	private static int staticVariable = 20;
	
	private void nonStaticMethod() 
	   { 
		   System.out.println(staticVariable); 
	   }
	
	public static void main(String[] args) 
	{
		Ex_17b obj = new Ex_17b();
		obj.nonStaticMethod();
	}
}
