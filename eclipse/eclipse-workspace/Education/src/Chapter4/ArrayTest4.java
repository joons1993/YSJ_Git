package Chapter4;

import java.util.Scanner;
public class ArrayTest4 {
	/*
	 * �̸�ã�� �׽�Ʈ
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"�����","������","�迵��","������","������","������","�ڼ���"};
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int index=-1;
		do {
			System.out.println("�˻��� �̸��� �Է��ϼ���");
			System.out.println("�̸�");
			String name = sc.next();
			for(int i=0;i<names.length;i++) {
				if(name.equals(names[i])) {
					index =i;
				}
			}
			if(index !=-1){
				System.out.println(name+ "�� �迭��" +index+"�ε��� �濡�� ã�ҽ��ϴ�.");
				break;
			}
			System.out.println("�ش��ϴ� �̸��� �������� �ʽ��ϴ�.");
		}
		while(true);

	}

}
