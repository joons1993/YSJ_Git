package Chapter3;

public class FlowTest4 {
	/**
	 * ���� if�� �׽�Ʈ
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.parseInt(args[0]);
		String generation="";
		if(age/10==1) {
			generation = "10��";
		}
		else if(age/10==2) {
			generation = "20��";
			
		}
		else if(age/10==3) {
			generation = "30��";
		}
		else if(age/10==4) {
			generation = "40��";
		}
		else if(age/10==5) {
			generation = "50��";
		}
		else if(age/10>=6) {
			generation = "50�� �̻��Դϴ�";
		}
		else {
			generation="����� �ƴմϴ�.";
		}
		System.out.println("�����" +generation+ "�Դϴ�");

	}

}
