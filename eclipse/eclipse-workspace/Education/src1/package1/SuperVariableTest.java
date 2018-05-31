package package1;

class Staff3{
	String name = "양상준";
}
class Sales3 extends Staff3{
	String name ="여찬양";
	String displayInfoLocal() {
		String name = "김영찬";
		return name;
	}

String displayInfoThis() {
	String name="김영찬";
	return this.name;
}
String displayInfoSuper() {
	String name="김영찬";
	return super.name;
}
}

public class SuperVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales3 sales3 = new Sales3();
		System.out.println("local.name="+sales3.displayInfoLocal());
		System.out.println("this.name="+sales3.displayInfoThis());
		System.out.println("super.name="+sales3.displayInfoSuper());

	}

}
