package Chapter4;

public class ArrayTest7 {
	/*
	 * ������ �迭 �׽�Ʈ (2���� �迭)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]multiArray = new int[2][2];
		char c = 'A';
		
		for(int i=0;i<multiArray.length;i++) {
			for(int j=0;j<multiArray[i].length;j++) {
				multiArray[i][j] =c++;
				
			}
		}
		for(int i=0;i<multiArray.length;i++) {
			for(int j=0;j<multiArray[i].length;j++) {
				System.out.println("multiArray["+i+"]["+j+"]=" +(char)multiArray[i][j]);
			}
		}
		

	}

}
