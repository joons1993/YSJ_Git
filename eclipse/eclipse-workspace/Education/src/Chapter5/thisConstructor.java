package Chapter5;
class House {
	int price;
	String dong;
	int size;
	String kind;
	public House() {
		//TODO Auto-generated constructor stub
		//System.out.println("this보다 앞에서 실행됨");
		
		this(100,42,"상일동","빌라");
	}
	public House(int price) {
		//TODO Auto-generated constructor stub
		this(price, 42, "상일동","빌라");
	}
	public House(int price, int size) {
		//TODO Auto-generated constructor stub
		this(price, size, "상일동","빌라");
	}
	public House(int price, int size, String dong) {
		this(price, size, dong, "빌라");
	}public House(int price, int size, String dong, String kind){
		//TODO Auto-generated constructor stub
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;
	}
	
}

public class thisConstructor {
	/*
	 * this 테스트
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house1 = new House();
		System.out.println("house1.price =" +house1.price+ ",house1.size =" +house1.size+
				",house1.dong =" +house1.dong+ ",house1.kind =" +house1.kind);
		
		House house2 = new House(300);
		System.out.println("house2.price =" +house2.price+ ",house2.size =" +house2.size+
				",house2.dong =" +house2.dong+ ",house2.kind =" +house2.kind);
		
		House house3 = new House(300,40);
		System.out.println("house3.price =" +house3.price+ ",house3.size =" +house3.size+
				",house3.dong =" +house3.dong+ ",house3.kind =" +house3.kind);
		
		House house4 = new House(300,40,"고덕동");
		System.out.println("house4.price =" +house4.price+ ",house4.size =" +house4.size+
				",house4.dong =" +house4.dong+ ",house4.kind =" +house4.kind);
		
		House house5 = new House(300, 40, "고덕동", "단독주택");
		System.out.println("house5.price =" +house5.price+ ",house5.size =" +house5.size+
				",house5.dong =" +house5.dong+ ",house5.kind =" +house5.kind);

	}

}
