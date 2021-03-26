package labBookDay01;

protected class Base{ 
	
	/* Error
	 * Class other than inner class cannot not be private or protected.
	 */
	String method() {
		return "wow";
	}
}

class Derived{  
	public void useD() {
		Base z=new Base();
		System.out.println("base says "+z.method());
		
	}
}