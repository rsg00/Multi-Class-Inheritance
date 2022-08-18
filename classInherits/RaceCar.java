package classInherits;

public class RaceCar extends Vehicle {

	public RaceCar(int year, String model) {
		super(year, model);
		// TODO Auto-generated constructor stub
	}

	public void go() {
		System.out.println("RaceCar is moving");
	}

	public void stop() {
		System.out.println("RaceCar hit the brakes");
	}

}
