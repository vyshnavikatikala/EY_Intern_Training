package labBookDay01;

public class Ex_17c {
	public static void main(String[] args) {
		checkConstructor c = new checkConstructor();
		
		/* Error
		 * The constructor checkConstructor() is undefined
		 */
	}
}
	class checkConstructor
	{
		checkConstructor(int a)
		{
			System.out.println("Check Constructor initialized");
		}
	}