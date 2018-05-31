
public class OperationTest9 {
	/**
	 * 삼항연산자
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		String msg =(num%2 ==0)? "짝수":"홀수";
		System.out.println(num+"는/은"+msg+"입니다");

	}

}
