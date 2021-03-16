package day1_Lab;

public class Ex_23 {
	public static void main(String[] args) {
		ClassToManipulateData obj=new ClassToManipulateData();
		obj.method();
	}
}
class ClassWithProtectedData{
	protected int var=10;
}
class ClassToManipulateData{
	public void method()
	{
		ClassWithProtectedData obj=new ClassWithProtectedData();
		System.out.println(obj.var);
	}
	
}

