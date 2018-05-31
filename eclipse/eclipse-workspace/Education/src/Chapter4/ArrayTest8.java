package Chapter4;

public class ArrayTest8 {
	/*
	 * 다차원 배열 테스트8
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]recArray = new int[5][5];
		
		for(int i=0;i<recArray.length;i++) {
			for(int j=0;j<recArray[i].length;j++) {
				if(i==0||i==recArray.length-1||j==0||j==recArray[i].length-1) {
					recArray[i][j] = 1;
				}
			}
		}
		for(int i=0;i<recArray.length;i++) {
			for(int j=0;j<recArray[i].length;j++) {
				System.out.println(recArray[i][j] + "");
				
			}
		}

	}

}
