package package1;
class OverridingParent{
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild extends OverridingParent{
	void parentMethod() {
		System.out.println("overriding method");
	}
}

public class OverridingT {
	//���������� �׽�Ʈ

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();

	}

}
