package Chapter3;
import java.util.Scanner;
public class Quiz2 {
	/*
	 * ��������
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String answer = "���ϵ�";
		String inString="";
		do {
			System.out.println("������� ��������??");
			inString = sc.next();
			if(inString.equals(answer)) {
				System.out.println("�����Դϴ�. �������� ��������" +answer+ "�Դϴ�.");
				break;
			}
			System.out.println("�ٽ� �Է��غ�����");
			
		}
		while(true);

	}

}
