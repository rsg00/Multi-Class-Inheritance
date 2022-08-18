package classInherits;

public class Vehicle {

	int year;
	String model;

	public Vehicle(int year, String model) {
		this.year = year;
		this.model = model;
	}

	public void go() {
		System.out.println(model + " " + year);
		System.out.println("were moving");
	}

	public void stop() {
		System.out.println("we hit the brakes");
	}

	public static void main(String[] args) {
		Vehicle obj = new Vehicle(1912, "Model T");
		System.out.println("vehicle");
		obj.go();
		obj.stop();
		System.out.println();

		Car carObj = new Car(1968, "Mustang");
		System.out.println("car");
		carObj.go();
		carObj.stop();
		System.out.println();

		Car carTwo = new Car(67, "Super Bee");
		System.out.println("car");
		carTwo.go();
		carTwo.stop();
		System.out.println();

		Vehicle truckObj = new Truck(1978, "C10");
		System.out.println("truck");
		truckObj.go();
		truckObj.stop();
		System.out.println();

		RaceCar raceCarobj = new RaceCar(1990, "Stock Car");
		System.out.println("racecar");
		raceCarobj.go();
		raceCarobj.stop();

	}

}
