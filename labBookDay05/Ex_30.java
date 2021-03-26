package labBookDay05;

public class Ex_30 {
	public static void main(String argv[]){ }
	public class MyInner {}                       //legal
    private class MyInner {}                      // not legal
	static class MyInner {}                       // legal
	friend class MyInner {}                       // not legal
	}
