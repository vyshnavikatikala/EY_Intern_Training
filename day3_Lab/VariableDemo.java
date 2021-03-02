package day3;

// 2 training rooms, 1 canteen, 2 projectors 

public class VariableDemo {
    public static void main(String[] args) {
    	
    	// Local variable
    	//instance variable
    	// class variable
    	
    	TrainingRoom room1 = new TrainingRoom();	
    	
    	room1.teach();room1.teach();room1.teach();
    	
    	TrainingRoom room2 = new TrainingRoom();
    }
}

class Chalk{
	public Chalk() {
		System.out.println("chalk object created....");
	}
}
class Canteen{
	Canteen(){ 
		System.out.println("Canteen Object is created...");
	}
}

class Projector{
     Projector() {
    	 System.out.println("Projector Object is created...");
}
}

class TrainingRoom{
	public TrainingRoom() {
		System.out.println("TrainingRoom Object is created...");
	}
	public void teach() {
		Chalk chalk = new Chalk(); // A non static variable inside a method is called local variable
		// you cannot declare a local variable static
	}
	Projector projector = new Projector();//instance variable
	static Canteen canteen = new Canteen();  //static creates only one instance and shared by multiple objects of the class //class variable
	//static variables are instantiated by JVM hence they are executed first.
}