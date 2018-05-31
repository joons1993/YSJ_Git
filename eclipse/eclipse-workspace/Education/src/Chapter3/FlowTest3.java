package Chapter3;

public class FlowTest3 {
	/**
	 * ¿±≥‚ ±∏«œ±‚
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = Integer.parseInt(args[0]);
		boolean isLeap = false;
		isLeap = (year%4 ==0 && year%100!=0||year%400==0);
		if(isLeap) {
			System.out.println(year+"≥‚¿∫ ¿±≥‚¿‘¥œ¥Ÿ.");
		}
		else {
			System.out.println(year+"≥‚¿∫ ¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.");
		}

	}

}
