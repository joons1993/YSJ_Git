package package1;

class OverridingParent2{
	int money = 15;
	void parentMethod() {
		System.out.println("parent method");
	}
}
class OverridingChild2 extends OverridingParent2{
	String money = "����";
	void parentMethod() {
		System.out.println("overriding method");
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money = "�̸���";
		System.out.println("oc2.money=" +oc2.money);

	}

}
