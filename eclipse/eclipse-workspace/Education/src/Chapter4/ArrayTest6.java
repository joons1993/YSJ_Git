package Chapter4;

public class ArrayTest6 {
	/*
	 * System.arraycopy �׽�Ʈ
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[] = {"����","����","ȭ��","��õ","��õ","��õ"};
		String names[] = new String[]{"����","����","ġ��","����","����","����","����"};
		String newArray[] = new String[cities.length + names.length];
		
		System.arraycopy(cities, 0,newArray,0,cities.length);
		System.arraycopy(names, 0, newArray,cities.length,names.length);
		for(String str:newArray) {
			System.out.println(str);
			
		}

	}

}
