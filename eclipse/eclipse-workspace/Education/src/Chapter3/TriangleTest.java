package Chapter3;

public class TriangleTest {
	/**
	 * ���� for �� �׽�Ʈ
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
			System.out.println(++num +"\t");
			
		}
			System.out.println();

	}
		num=0;
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=(6-x);y++) {
				System.out.println(++num +"\t");
			}
			System.out.println();
		}
	}

}
