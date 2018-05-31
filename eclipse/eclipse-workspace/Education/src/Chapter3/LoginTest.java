package Chapter3;

public class LoginTest {
	/**
	 * 로그인 테스트
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String passwd = args[1];
		
		if(!id.equals("양상준")) {
			System.out.println("당신은 회원이 아닙니다.");
		}
		else if(!passwd.equals("양상준")) {
			System.out.println("비밀번호가 잘못되었습니다.");
		}
		else {
			System.out.println("안녕하세요!");
		}

	}

}
