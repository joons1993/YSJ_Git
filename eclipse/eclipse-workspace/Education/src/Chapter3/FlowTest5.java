package Chapter3;

public class FlowTest5 {
	/**
	 * 중첩 if문 테스트
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int total = 0;
		
		//total 점수계산
		total = kor + mat + eng;
		
		//외부 if문장
		if(total>=180) {
			
			if(kor<40||mat<40||eng<40) {
				System.out.println("불합격입니다.");
			}
			else {
			System.out.println("합격입니다");
		}
		

	}
		else {
			System.out.println("당신은 총점이 모자랍니다. 불합격입니다.");
		}
	}
}


	
