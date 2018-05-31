package Chapter5;

class boiler{
	String maker;
	String color;
	int temp;
	
	void tempUp() {
		temp++;
	}
	void tempUp(int amount) {
		temp = temp + amount;
	}
}

public class overloadingTest {
	/*
	 * 오버로딩 테스트
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boiler bo = new boiler();
		System.out.println("현재 온도 : " +bo.temp);
		bo.tempUp();
		System.out.println("bo.tempUp() 호출한 이후의 현재온도 : " +bo.temp);
		bo.tempUp(30);
		System.out.println("bo.tempUP(30) 호출한 이후의 현재온도 : "+bo.temp);
		
		

	}

}
