package Chapter5;

public class VariableArgument {
	/*
	 * 가변 인자 메소드
	 */
	void printInfo(String...infos) {
		if(infos.length != 0) {
			for(int i=0;i<infos.length;i++) {
				System.out.println(infos[i]);
			}
		}
		else {
			System.out.println("인자가 없습니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgument vt = new VariableArgument();
		System.out.println("인자없음");
		vt.printInfo();
		System.out.println("인자 하나");
		vt.printInfo("오정원");
		System.out.println("인자 두개");
		vt.printInfo("전산부","오정원");
		System.out.print("인자 세 개");
		vt.printInfo("전산부","오정원","1억원");

	}

}
