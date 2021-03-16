package day12;

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("first line of code..");
		// met();
		new Thread(new Runnable() { // Anonymous inner class
			@Override
			public void run() {
				met();
			}
		}).start();
		System.out.println("third line of code");
	}

	public static void met() {
		// System.out.println("second line of code");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		System.out.println("second line of code");
	}
}
