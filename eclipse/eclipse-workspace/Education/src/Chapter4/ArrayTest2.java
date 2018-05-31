package Chapter4;

public class ArrayTest2 {
	/*
	 * 배열의 length 속성 사용 테스트
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		int[] array1 = new int[3];
		
		for(int i=0;i<array1.length;i++) {
			array1[i]=num++;
		}
		
		for(int i=0;i<array1.length;i++) {
			System.out.println("array1["+"]=" +array1[i]);
		}

	}

}
