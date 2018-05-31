package Chapter4;

class ArrayTest3 {
	/*
	 * 배열을 초기화시키면서 생성하는 기능 테스트
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[]= {"서울","대구","부산","광주","원주","나주"};
		String nations[]= {"일본","우리나라","미국","핀란드","캐나다"};
		
		//배열값 출력
		for(int i=0;i<cities.length;i++) {
			System.out.println("cities["+i+"]="+cities[i]);
		}
		for(int i=0;i<nations.length;i++) {
			System.out.println("nation["+i+"]="+nations[i]);
		}

	}

}
