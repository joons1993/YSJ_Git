package chapter7;
abstract class AbstractClass{
	int age;
	void generalMethod() {
		System.out.println("�Ϲݸ޼ҵ�");
	}
	
	abstract void abstractMethod();
}
class AbstractChildClass extends AbstractClass{
	@Override
	void abstractMethod() {
		System.out.println("�߻� �޼ҵ� ����");
	}
}
public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildClass acc = new AbstractChildClass();
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();

	}

}
