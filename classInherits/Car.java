package classInherits;

public class Car extends Vehicle {

	public Car(int year, String model) {
		super(year, model);
		// TODO Auto-generated constructor stub
	}

	public void go() {
		System.out.println("car is moving");
	}

	public void stop() {
		System.out.println("car hit the brakes");
	}

}
