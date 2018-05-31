package Chapter4;

import java.util.Scanner;
public class ArrayTest4 {
	/*
	 * 이름찾기 테스트
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"양상준","선종균","김영찬","유동진","여찬양","최윤준","박수빈"};
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int index=-1;
		do {
			System.out.println("검색할 이름을 입력하세요");
			System.out.println("이름");
			String name = sc.next();
			for(int i=0;i<names.length;i++) {
				if(name.equals(names[i])) {
					index =i;
				}
			}
			if(index !=-1){
				System.out.println(name+ "은 배열의" +index+"인덱스 방에서 찾았습니다.");
				break;
			}
			System.out.println("해당하는 이름이 존재하지 않습니다.");
		}
		while(true);

	}

}
