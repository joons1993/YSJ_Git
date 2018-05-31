package Chapter5;

public class SearchService {
	Member[] members = new Member[5];
	public SearchService() {
		// TODO Auto-generated method stub
		members[0] = new Member("양상준",176,78,"대한민국");
		members[1] = new Member("이상호",168,70,"대한민국");
		members[2] = new Member("김영찬",175,79,"대한민국");
		members[3] = new Member("여찬양",173,72,"대한민국");
		members[4] = new Member("선종균",170,60,"대한민국");

	}
	boolean searchMember(String name) {
		boolean searchResult=false;
		for(int i=0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				searchResult = true;
			}
			
		}
		return searchResult;
	}
	private void printInfo(Member member) {
		//TODO Auto-generated method stub
		System.out.println(member.getName() +"으로 찾은 결과");
		System.out.println("이름 :" +member.getName());
		System.out.println("신장 :" +member.getHeight());
		System.out.println("몸무게 :" +member.getWeight());
		System.out.println("국가 :" +member.getNation());
		
		
	}

}
