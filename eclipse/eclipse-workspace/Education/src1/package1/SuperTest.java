package package1;
class Staff{
	String name;
	String dept;
	int salary;
	
	String displayInfo() {
		return "�̸�:" +name+ ",�μ�:"+dept+",����:"+salary; 
	}
}
class Sales extends Staff{
	int commition;
	String displayInfo() {
		return super.displayInfo() +"����," +commition;
	}
}


public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sales sales = new Sales();
		System.out.println(sales.displayInfo());

	}

}
