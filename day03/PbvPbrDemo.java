package day03;

public class PbvPbrDemo {
	public static void main(String[] args) {
		Laddu ladduobj = new Laddu();
		ladduobj.setSize(10);
		System.out.println("Original size of laddu " + ladduobj.getSize());
		PBV pbv = new PBV();
		pbv.met(ladduobj.getSize());
		System.out.println("Later size of laddu after pass by value : " + ladduobj.getSize());

		PBR pbr = new PBR();
		pbr.met(ladduobj);
		System.out.println("Later size of laddu after pass by reference : " + ladduobj.getSize());
	}
}

class PBV {
	public void met(int ladduSize) {
		ladduSize = ladduSize - 5;
	}
}

class PBR {
	public void met(Laddu laddu) {
		laddu.setSize(5);
	}
}

class Laddu {
	private int size;

	public void setSize(int size) {
		this.size = size; // this refers to current instance
	}

	public int getSize() {
		return this.size;
	}
}
