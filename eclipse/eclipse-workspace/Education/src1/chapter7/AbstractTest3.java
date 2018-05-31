package chapter7;


abstract class Vehicle{
	abstract void move();
}
class Car extends Vehicle{
	@Override
	void move() {
		System.out.println("차도로 다닌다");
	}
}
class Ship extends Vehicle{
	@Override
	void move() {
		System.out.println("바다로 다닌다");
	}
}
class Plane extends Vehicle{
	@Override
	void move() {
		System.out.println("하늘로 다니다");
	}
}

class VehicleUse{
	void getMoveStyle(Vehicle vehicle) {
		vehicle.move();
	}
}
public class AbstractTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Ship ship = new Ship();
		Plane plane = new Plane();
		VehicleUse v_use = new VehicleUse();
		
		v_use.getMoveStyle(car);
		v_use.getMoveStyle(plane);
		v_use.getMoveStyle(ship);

	}

}
