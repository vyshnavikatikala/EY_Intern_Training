package labBookDay05;

public class Ex_59 {
	private void amethod(int iBase){                      // Compile time error complaining that Ex_59.amethod is private
		System.out.println("Ex_59.amethod");
		}
}

class Over extends Ex_59{
public static void main(String argv[]){
Over o = new Over();
int iBase=0;
o.amethod(iBase);
}
public void amethod(int iOver){
System.out.println("Over.amethod");
}
}
