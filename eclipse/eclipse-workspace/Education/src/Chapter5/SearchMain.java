package Chapter5;

import java.util.Scanner;

public class SearchMain {
	/*
	 * �̸����� �˻� ����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchService sv = new SearchService();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("�˻��� ȸ�� �̸��� �Է��ϼ���");
			String name = sc.next();
			boolean searchResult = sv.searchMember(name);
			if(searchResult)break;
			System.out.println("�ش�ȸ���� �����ϴ�.");
		}
		while(true);
	}

}
