package Chapter6;

class Parent {
	int parentVar = 10;
	void parantMethod() {
		System.out.println("parent Method");
	}
}
class Child extends Parent {
	int childVar = 20;
	void childMethod() {
		System.out.println("child Method");
	}
}

public class ExtendsTest {
	/*
	 * ����׽�Ʈ
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		System.out.println("child.parentVar =" +child.parentVar);
		System.out.println("child.childVar ="+child.childVar);
		child.parantMethod();
		child.childMethod();

	}

}