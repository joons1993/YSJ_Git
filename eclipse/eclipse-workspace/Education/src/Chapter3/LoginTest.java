package Chapter3;

public class LoginTest {
	/**
	 * �α��� �׽�Ʈ
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String passwd = args[1];
		
		if(!id.equals("�����")) {
			System.out.println("����� ȸ���� �ƴմϴ�.");
		}
		else if(!passwd.equals("�����")) {
			System.out.println("��й�ȣ�� �߸��Ǿ����ϴ�.");
		}
		else {
			System.out.println("�ȳ��ϼ���!");
		}

	}

}
