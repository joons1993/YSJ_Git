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
	 * �����ε� �׽�Ʈ
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boiler bo = new boiler();
		System.out.println("���� �µ� : " +bo.temp);
		bo.tempUp();
		System.out.println("bo.tempUp() ȣ���� ������ ����µ� : " +bo.temp);
		bo.tempUp(30);
		System.out.println("bo.tempUP(30) ȣ���� ������ ����µ� : "+bo.temp);
		
		

	}

}
