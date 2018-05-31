package Chapter5;

public class AirConUse2 {
	/*
	 * 같은 클래스를 이용하서 여러 객체 만들기 테스트
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon airCon1 = new AirCon();
		
		//변수 사용
		airCon1.color="Blue";
		airCon1.temp=10;
		airCon1.price=1000;
		
		//메소드 사용_첫번째 객체
		airCon1.tempUp();
		System.out.println("airCon1.temp="+airCon1.temp+" airCon1.color="+airCon1.color+
				"\n airCon1.price=" +airCon1.price+ "원 입니다.");
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println("airCon1.temp="+airCon1.temp+" airCon1.color="+airCon1.color+
				"\n airCon1.price=" +airCon1.price+ "원 입니다.");
		//두번째 객체
		AirCon airCon2 = new AirCon();
		System.out.println("airCon2.temp="+airCon2.temp+" airCon2.color="+airCon2.color+
				"\n airCon2.price="+airCon2.price+"원  입니다.");
		//에어컨1에 에어컨2 번수 참조값 할당
		airCon2 = airCon1;
		System.out.println("airCon2.temp="+airCon2.temp+" airCon2.color="+airCon2.color+
				"\n airCon2.price="+airCon2.price+"원  입니다.");
		
	

	}

}
