package day14;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {
	public static void main(String[] args) {
		FireAlarm shakthi = new FireAlarm();
		Student ey = new Student();
		Teacher shoiab = new Teacher();

		shakthi.addObserver(shoiab);
		shakthi.addObserver(ey);

		shakthi.setAlarm();
	}
}

class FireAlarm extends Observable {
	public void setAlarm() {
		setChanged();
		notifyObservers();
	}
}

class Student implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		run();
	}

	public void run() {
		System.out.println("Student is running........................");
	}
}

class Teacher implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		run();
	}

	public void run() {
		System.out.println("Teacher is running.........................");
	}
}