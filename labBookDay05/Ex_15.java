package labBookDay05;
import java.io.*;
public class Ex_15 {
	public static void main(String argv[]){
		Ex_15 m=new Ex_15();
		System.out.println(m.amethod());   // -1 is returned and gets printed
	}	
		public int amethod() {
			try {
			FileInputStream dis=new FileInputStream("Hello.txt");
			}catch (FileNotFoundException fne) {
			System.out.println("No such file found");   // catch block gets printed as no such file called hello.txt is found
			return -1;
			}catch(IOException ioe) {
			} finally{
			System.out.println("Doing finally");  // finally block gets printed by default
			}
			return 0;
	  }
}
	
	
