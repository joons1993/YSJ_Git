package Chapter3;

public class FlowTest5 {
	/**
	 * ��ø if�� �׽�Ʈ
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int total = 0;
		
		//total �������
		total = kor + mat + eng;
		
		//�ܺ� if����
		if(total>=180) {
			
			if(kor<40||mat<40||eng<40) {
				System.out.println("���հ��Դϴ�.");
			}
			else {
			System.out.println("�հ��Դϴ�");
		}
		

	}
		else {
			System.out.println("����� ������ ���ڶ��ϴ�. ���հ��Դϴ�.");
		}
	}
}


	
