package labBookDay05;

public class Ex_33 implements Runnable {
	int i=0;
	public int run(){                        // The code will cause an error at compile time.
	while(true){
	i++;
	System.out.println("i="+i);
	} //End while
	return 1;
	}//End run
}
