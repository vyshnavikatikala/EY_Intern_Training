package labBookDay05;

private class Base{                                 // compile time error
Base(){
int i = 100;
System.out.println(i);
}
}

public class Ex_43 extends Base {
	static int i = 200;
	public static void main(String argv[]){
	Ex_43 p = new Ex_43();
	System.out.println(i);                          // 200 will get printed
	}
}
