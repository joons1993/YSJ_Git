package Chapter5;

public class SearchService {
	Member[] members = new Member[5];
	public SearchService() {
		// TODO Auto-generated method stub
		members[0] = new Member("�����",176,78,"���ѹα�");
		members[1] = new Member("�̻�ȣ",168,70,"���ѹα�");
		members[2] = new Member("�迵��",175,79,"���ѹα�");
		members[3] = new Member("������",173,72,"���ѹα�");
		members[4] = new Member("������",170,60,"���ѹα�");

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
		System.out.println(member.getName() +"���� ã�� ���");
		System.out.println("�̸� :" +member.getName());
		System.out.println("���� :" +member.getHeight());
		System.out.println("������ :" +member.getWeight());
		System.out.println("���� :" +member.getNation());
		
		
	}

}
