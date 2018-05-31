package chapter7;


abstract class Vehicle{
	abstract void move();
}
class Car extends Vehicle{
	@Override
	void move() {
		System.out.println("������ �ٴѴ�");
	}
}
class Ship extends Vehicle{
	@Override
	void move() {
		System.out.println("�ٴٷ� �ٴѴ�");
	}
}
class Plane extends Vehicle{
	@Override
	void move() {
		System.out.println("�ϴ÷� �ٴϴ�");
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
