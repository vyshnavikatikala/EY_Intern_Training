package labBookDay05;

public class Ex_12 {
	public static void main(String[] args) {
	int i=1;
	switch (i) {
	case 0:
	        System.out.println("zero");
	        break;
	case 1:
	        System.out.println("one");
	case 2:
	        System.out.println("two");
	default:
	        System.out.println("default");
	}
	/*
	 * it prints one,two,default as there is no break
	 */
  }
}
