package labBookDay05;


abstract class MineBase {
abstract void amethod();
static int i;
}

public abstract class Ex_11_ExecuteCode6 extends MineBase {  // Error - Mine must be declared abstract
	public static void main(String argv[]){
		int[] ar=new int[5];
		for(i=0;i < ar.length;i++)
		System.out.println(ar[i]);
		}
}
