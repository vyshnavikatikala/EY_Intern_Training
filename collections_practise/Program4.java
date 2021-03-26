package collections_practise;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
	public static void main(String[] args) {
		Map m = new HashMap();
		
		MyKeys m1 = new MyKeys(1);
		MyKeys m2 = new MyKeys(2);
		MyKeys m3 = new MyKeys(1);
		MyKeys m4 = new MyKeys(new Integer(2));
		
		m.put(m1, "car");
		m.put(m2, "bike");
		m.put(m3, "scooty");
		m.put(m4, "bus");
		
		System.out.println(m.size());
	}
}

class MyKeys {
	Integer key;
	
	public MyKeys(Integer k) {
		key = k;
	}
	
	public boolean equals(Object o) {
		return ((MyKeys) o).key == this.key;
	}
}