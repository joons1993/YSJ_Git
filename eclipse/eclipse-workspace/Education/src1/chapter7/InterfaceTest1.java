package chapter7;
interface Interface1{
	int interVar = 10;
	void interface1Method();
	}

class Interface1Impl implements Interface1{
	@Override
	public void interface1Method() {
		System.out.println("인터페이스1 구현 성공");
	}
	
}



public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1Impl in1Impl = new Interface1Impl();
		System.out.println("in1Impl.interVar =" +in1Impl.interVar);
		System.out.println("Interface1.interVar =" +Interface1.interVar);
		in1Impl.interface1Method();

	}

}
