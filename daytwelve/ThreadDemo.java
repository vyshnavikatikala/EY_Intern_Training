package daytwelve;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
	public ThreadDemo(){
		
//		Thread t = new Thread(new ThreadJob());
//		t.start();
		ExecutorService es = Executors.newFixedThreadPool(1);   // to create a thread
		es.execute(new ThreadJob());
		es.shutdown();
		
	}
	
   public static void main(String[] args) throws Exception{
	new ThreadDemo(); 
	//Thread t = Thread.currentThread();
	//t.setName("vyshu");
	//System.out.println(t);
	
	for(int i=0;i<5;i++) {
		System.out.println(i);  // first 0 gets printed and then main thread sleeps for 1 sec and prints child thread,
		Thread.sleep(1000);     // then after 1 sec....the main thread printing continues
		
	}
}
}

class ThreadJob implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child thread is working");
	}
}
