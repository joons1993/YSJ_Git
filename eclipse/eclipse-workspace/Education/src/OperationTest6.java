
public class OperationTest6 {
	/**
	 * ��Ʈ ������ �׽�Ʈ
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		int y = 3;
		int result = 0;
		boolean bResult = false;
		
		/* ��Ʈ�� ����
		 * 8 : 00000000 00000000 00000000 00001000
		 * 3 : 00000000 00000000 00000000 00000011
		 */
		
		//&
		result = x & y;
		System.out.println("x & y ="+result);
		bResult=true&false;
		System.out.println("true&false="+bResult);
		
		//|
		result = x|y;
		System.out.println("x|y ="+result);
		bResult=true|false;
		System.out.println("true|false="+bResult);
		
		//^
		result = x^y;
		System.out.println("x^y ="+result);
		bResult=true^false;
		System.out.println("true^false="+bResult);
	
	}

}
