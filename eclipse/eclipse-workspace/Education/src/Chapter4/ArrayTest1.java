package Chapter4;

public class ArrayTest1 {
	/*
	 * �迭 ����, �迭 ��ü �׽�Ʈ
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭����
		int ages[];
		String names[];
		
		//�迭 ��ü ����
		ages=new int[3];
		names=new String[3];
		
		//�ʱ�ȭ
		ages[0]=1;
		ages[1]=2;
		ages[3]=3;
		
		names[0]="�����";
		names[1]="������";
		names[2]="��ġ";
		
		//�� ���
		for(int i=0;i<3;i++) {
			System.out.println("ages["+i+"]=" +ages[i]);
			System.out.println("names["+i+"]=" +names[i]);
		}

	}

}
