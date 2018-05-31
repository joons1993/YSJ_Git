package Chapter3;

public class FlowTest4 {
	/**
	 * 다중 if문 테스트
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.parseInt(args[0]);
		String generation="";
		if(age/10==1) {
			generation = "10대";
		}
		else if(age/10==2) {
			generation = "20대";
			
		}
		else if(age/10==3) {
			generation = "30대";
		}
		else if(age/10==4) {
			generation = "40대";
		}
		else if(age/10==5) {
			generation = "50대";
		}
		else if(age/10>=6) {
			generation = "50대 이상입니다";
		}
		else {
			generation="사람이 아닙니다.";
		}
		System.out.println("당신은" +generation+ "입니다");

	}

}
