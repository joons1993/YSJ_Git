package Chapter3;
import java.util.Scanner;

public class Quiz {
	/**
	 * �������� ���纸��
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int number=(int)(Math.random()*100) +1;
			int inNumber=0;
		
		
		do {
			System.out.println("���ڸ� �Է����ּ���");
			inNumber = sc.nextInt();
			
			if(inNumber == number) {
				System.out.println("�����Դϴ�!");
			}
			else if(inNumber < number) {
				System.out.println("���ڰ� �ʹ� �۽��ϴ�...");
			}
			else if(inNumber > number) {
				System.out.println("���ڰ� �ʹ� Ů�ϴ�...");
			}
			else {
				System.out.println("�ùٸ� ���ڸ� �Է��Ͽ� �ּ���...");
			}
		}
			while(true);
	}

}