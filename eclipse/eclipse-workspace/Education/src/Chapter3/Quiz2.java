package Chapter3;
import java.util.Scanner;
public class Quiz2 {
	/*
	 * 수도퀴즈
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String answer = "상일동";
		String inString="";
		do {
			System.out.println("양상준의 서식지는??");
			inString = sc.next();
			if(inString.equals(answer)) {
				System.out.println("정답입니다. 상양상준의 서식지는" +answer+ "입니다.");
				break;
			}
			System.out.println("다시 입력해보세요");
			
		}
		while(true);

	}

}
