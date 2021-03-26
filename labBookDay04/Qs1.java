package labBookDay04;
import java.io.IOException;

public class Qs1 {
     public static void main(String[] args) {
    	 ExceptionDemo.met();
	}
}
class ExceptionDemo {
	public static void met() {
		throw new IOException(); // Unhandled IOException
	}
}
