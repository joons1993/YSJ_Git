package Chapter3;
import java.util.Scanner;

public class Quiz {
	/**
	 * 난수값을 맞춰보자
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int number=(int)(Math.random()*100) +1;
			int inNumber=0;
		
		
		do {
			System.out.println("숫자를 입력해주세요");
			inNumber = sc.nextInt();
			
			if(inNumber == number) {
				System.out.println("정답입니다!");
			}
			else if(inNumber < number) {
				System.out.println("숫자가 너무 작습니다...");
			}
			else if(inNumber > number) {
				System.out.println("숫자가 너무 큽니다...");
			}
			else {
				System.out.println("올바른 숫자를 입력하여 주세요...");
			}
		}
			while(true);
	}

}