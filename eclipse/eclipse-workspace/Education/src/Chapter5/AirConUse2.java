package Chapter5;

public class AirConUse2 {
	/*
	 * ���� Ŭ������ �̿��ϼ� ���� ��ü ����� �׽�Ʈ
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon airCon1 = new AirCon();
		
		//���� ���
		airCon1.color="Blue";
		airCon1.temp=10;
		airCon1.price=1000;
		
		//�޼ҵ� ���_ù��° ��ü
		airCon1.tempUp();
		System.out.println("airCon1.temp="+airCon1.temp+" airCon1.color="+airCon1.color+
				"\n airCon1.price=" +airCon1.price+ "�� �Դϴ�.");
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println("airCon1.temp="+airCon1.temp+" airCon1.color="+airCon1.color+
				"\n airCon1.price=" +airCon1.price+ "�� �Դϴ�.");
		//�ι�° ��ü
		AirCon airCon2 = new AirCon();
		System.out.println("airCon2.temp="+airCon2.temp+" airCon2.color="+airCon2.color+
				"\n airCon2.price="+airCon2.price+"��  �Դϴ�.");
		//������1�� ������2 ���� ������ �Ҵ�
		airCon2 = airCon1;
		System.out.println("airCon2.temp="+airCon2.temp+" airCon2.color="+airCon2.color+
				"\n airCon2.price="+airCon2.price+"��  �Դϴ�.");
		
	

	}

}
