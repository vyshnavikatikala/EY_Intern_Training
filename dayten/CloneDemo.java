//CloneDemo
package dayten;

public class CloneDemo {
	public static void main(String[] args) throws Exception {
		Sheep sheep1 = new Sheep();
		sheep1.name = "I am sheep 1";

		// Sheep sheep2 = new Sheep();
		// sheep2.name = "I am sheep 2"; -Nothing is shared

		// Sheep sheep2 = sheep1; -Resources and properties both are shared

		Sheep sheep2 = sheep1.getSheepClone(); // -Properties are unique but resources are shared
		sheep2.name = "I am sheep 2";

		System.out.println("Sheep 1 : " + sheep1.name);

		System.out.println("Sheep 2 : " + sheep2.name);
	}
}

class Sheep implements Cloneable {
	String name;

	public Sheep() { // constructor
		System.out.println("sheep object created");
	}

	public Sheep getSheepClone() throws Exception {
		return (Sheep) super.clone();
	}
}