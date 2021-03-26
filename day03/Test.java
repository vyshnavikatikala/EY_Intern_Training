package day03;

public class Test { //same class same package
	private     int pri;
	            int nomod; //no modifier
	protected   int pro;
	public      int pub;
	
	public void met() { //creating a public method of same class
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
		// All are accessible
	}
}

