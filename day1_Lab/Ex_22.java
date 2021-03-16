package day1_Lab;

public class Ex_22{

	public static void main(String[] args) {
		
		AccessSpecification obj=new AccessSpecification();
		
		System.out.println("Default: "+obj.nomod);
		System.out.println("Private: "+obj.pri); // Private Variable not accessible
		System.out.println("Protected: "+obj.pro);
		System.out.println("Public: "+obj.pub);
	    obj.privateTest();  //Private Method Not accessible
	    obj.protectedTest();
	    obj.defaultMethod();
		obj.publicTest();
	}

}

class AccessSpecification{

	int nomod=2;
	private int pri=3;
	protected int pro=5;
	public int pub=7;
	
	void defaultMethod() {
		System.out.println("Default Method");
	}
	private void privateTest() {
		System.out.println("Private Method");
	}
	protected void protectedTest() {
		System.out.println("Protected Method");
	}
	public void publicTest() {
		System.out.println("Public Method");
	}
	
	
}