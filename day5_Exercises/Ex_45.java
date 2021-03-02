package day5;

public class Ex_45 {
	public static void main(String argv[]){
		Ex_45 r = new Ex_45();
		r.amethod(r);
		}
		public void amethod(Ex_45 r){
		int i=99;
		multi(r);
		System.out.println(i);
		}
		public void multi(Ex_45 r){
		r.i = r.i*2;                                  // compile time error
		}
}
