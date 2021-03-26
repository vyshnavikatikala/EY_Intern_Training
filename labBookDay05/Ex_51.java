package labBookDay05;

public class Ex_51 {
	private int i;
	public static void main(String argv[]){
	Ex_51 s = new Ex_51();
	s.amethod();
	}//End of main
	public static void amethod(){
	System.out.println(i);                      // A compile time error complaining of the scope of the variable i
	}//end of amethod
}
