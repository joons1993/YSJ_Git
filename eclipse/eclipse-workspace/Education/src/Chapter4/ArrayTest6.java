package Chapter4;

public class ArrayTest6 {
	/*
	 * System.arraycopy 테스트
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[] = {"서울","수원","화성","인천","부천","순천"};
		String names[] = new String[]{"상준","병민","치권","영찬","종균","수빈","찬양"};
		String newArray[] = new String[cities.length + names.length];
		
		System.arraycopy(cities, 0,newArray,0,cities.length);
		System.arraycopy(names, 0, newArray,cities.length,names.length);
		for(String str:newArray) {
			System.out.println(str);
			
		}

	}

}
