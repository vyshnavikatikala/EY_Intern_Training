package day5;

public class Ex_35 {
	public static void main(String argv[]){
		Ex_35 c=new Ex_35();
		String s=new String("ello");
		c.amethod(s);
		}
		public void amethod(String s){
		char c='H';
		c+=s;                                   // Compile time error 
		System.out.println(c);
		}
}
