package Chapter5;

public class VariableArgument {
	/*
	 * ���� ���� �޼ҵ�
	 */
	void printInfo(String...infos) {
		if(infos.length != 0) {
			for(int i=0;i<infos.length;i++) {
				System.out.println(infos[i]);
			}
		}
		else {
			System.out.println("���ڰ� �����ϴ�.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgument vt = new VariableArgument();
		System.out.println("���ھ���");
		vt.printInfo();
		System.out.println("���� �ϳ�");
		vt.printInfo("������");
		System.out.println("���� �ΰ�");
		vt.printInfo("�����","������");
		System.out.print("���� �� ��");
		vt.printInfo("�����","������","1���");

	}

}
