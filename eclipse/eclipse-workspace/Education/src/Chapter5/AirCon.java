package Chapter5;

class AirCon{
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	//�޼ҵ� ����
	void powerOn() {
		System.out.println("power on");
	}
	void powerOff() {
		System.out.println("power off");
	}
	void tempUp() {
		temp++;
	}
	void tempDown() {
		temp--;
	}
}
