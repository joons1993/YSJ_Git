package package1;

class Sales2 extends Staff2 {
	int commition;
	
	public Sales2(String name, String dept, int salary,int commition) {
		//super()
		super(name,dept,salary);
		this.commition = commition;
	}
	
	String displayInfo() {
		return super.displayInfo() + ",수당:" +commition;
	}
}

public class ConstructorTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales2 sales2 = new Sales2("양상준", "컴퓨터학과",1000000,70000);
		System.out.println(sales2.displayInfo());

	}
}


