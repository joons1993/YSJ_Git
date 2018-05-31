package chapter7;
abstract class AbstractClass{
	int age;
	void generalMethod() {
		System.out.println("일반메소드");
	}
	
	abstract void abstractMethod();
}
class AbstractChildClass extends AbstractClass{
	@Override
	void abstractMethod() {
		System.out.println("추상 메소드 구현");
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
