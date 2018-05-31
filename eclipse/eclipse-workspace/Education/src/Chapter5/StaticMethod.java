package Chapter5;

public class StaticMethod {
	int memVar;
	static int staticVar;
	
	void memMethod1(){
		int local = memVar;
		local = staticVar;
		staticMethod1();
		memMethod2();
		System.out.println("memMethod1");
	}
	void memMethod2(){
		System.out.println("memMethod2");
	}
	static void staticMethod1(){
		//int local = memVar;
		//memMethod1()
		StaticMethod st = new StaticMethod();
		int local = st.memVar;
		st.memMethod2();
		staticMethod1();
		System.out.println("staticMethod1");
	}

	static void staticMethod2() {
		// TODO Auto-generated method stub
		System.out.println("staticMethod2");
		
	}
	/*
	 * StaticMethod 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StaticMethod.memMethod1();
		StaticMethod st = new StaticMethod(); //class의 객체를 선언
		st.memMethod1();
		StaticMethod.staticMethod2();
		staticMethod2();
		
		int local = staticVar; //local = memVar;
		

	}
}

