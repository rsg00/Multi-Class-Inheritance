package classInherits;

public class Truck extends Vehicle {

	public Truck(int year, String model) {
		super(year, model);
		// TODO Auto-generated constructor stub
	}

	public void go() {
		System.out.println("Truck is moving");
	}

	public void stop() {
		System.out.println("Truck hit the brakes");
	}

}
