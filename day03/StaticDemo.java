package day03;

public class StaticDemo {
	public static void main(String[] args) {
		// Connection con = new Connection(); // not visible
		 //Connection con = Connection.getConnection();
		 Connection.someMethod1();
		 Connection.someMethod2();
	} 
}

class Connection{
	private Connection() {  //private constructor
		System.out.println("constructor is called...");
	}
	static {
		System.out.println("static block clalled...");
	}
	public static Connection getConnection() {
		return new Connection();
	}
	public static void someMethod1() {
		//in this method constructor is not invoked....
		System.out.println("someMethod1 logic");
	}
	public static void someMethod2() {
		//in this method constructor is not invoked....
		System.out.println("someMethod2 logic");
	}
}

//Static keyword - using this we can create class variables
