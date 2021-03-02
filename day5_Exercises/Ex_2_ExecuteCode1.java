package day5;

public class Ex_2_ExecuteCode1 {
	public static void main(String arguments[]) {
		amethod(arguments);  // error - Can't make static reference to (non-static) void amethod.
		// To call the method, we have to create a object of type amethod() 
		}
		public void amethod(String[] arguments) {
		System.out.println(arguments);
		System.out.println(arguments[1]);
		}
}
