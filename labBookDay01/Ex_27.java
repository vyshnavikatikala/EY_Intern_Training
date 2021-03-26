package labBookDay01;

public class Ex_27 {
	public static void main(String[] args) {
		
		double value = 14000 + (0.40 * 14000);
		
		System.out.println("The amount is: "+value+" at the end of First Year");
		
		value = value - 1500;
		
		System.out.println("The amount is: "+value+" at the end of Second Year");
		
		value = (value * 0.12) + value;
		
		System.out.println("The amount is: "+value+" at the end of Third Year");
	}
}
