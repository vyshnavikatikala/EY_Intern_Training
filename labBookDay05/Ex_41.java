package labBookDay05;

public class Ex_41 {
	static int j=20;
	public static void main(String argv[]){
	int i=10;
	Ex_41 p = new Ex_41();
	p.amethod(i);
	System.out.println(i);
	System.out.println(j);
	}
	public void amethod(int x){
	x=x*2;
	j=j*2;
	}
	/*
	 * 10 40
	 */
}
