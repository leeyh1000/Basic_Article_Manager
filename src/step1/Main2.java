package step1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
	// 콘솔 게시판
	public static void main(String[] args) {
		System.out.println("-프로그램 시작-");
		Scanner sc = new Scanner(System.in);
		ArrayList<Articles> lists = new ArrayList<>();

		while (true) {
			System.out.printf("명령어 입력해 주세요: ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("exit")) {
				break;
			} else if (cmd.equals("article list")) {
				if(lists.size()==0)	System.out.println("게시물이 존재하지 않습니다.");
				else {
					for(Articles a : lists) {
						System.out.println("작성자 : "+a.id);
						System.out.println("제목 : "+a.title);
						System.out.println("내용 : "+a.contents);
						System.out.println("================");
					}
				}

			} else if (cmd.equals("article write")) {
				System.out.printf("작성자를 입력해주세요 : ");
				String id = sc.nextLine();
				System.out.printf("제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.printf("내용을 입력해주세요 : ");
				String contents = sc.nextLine();
				Articles at = new Articles();
				at.title = title;
				at.contents = contents;
				at.id = id;
				lists.add(at);

				System.out.printf("%d번 글이 생성되었습니다\n", lists.size());
			} else if (cmd.equals("") || cmd.length() == 0) {
				System.out.println("명령어를 입력해 주세요.");
			} else if (cmd.equals("article search")) {	
				System.out.println("검색어 입력해 주세요. : ");
				int isExist = 0;
				String str= sc.nextLine();
				for(Articles a : lists) {
					if( a.id.contains(str) || a.contents.contains(str) || a.title.contains(str)) {
						System.out.println("작성자 : "+a.id);
						System.out.println("제목 : "+a.title);
						System.out.println("내용 : "+a.contents);
						System.out.println("================");
						isExist = 1;
						break;
					}else {
						continue;
					}
				}
				if(isExist > 0) System.out.println("찾은 결과는 위와 같습니다.");
				else System.out.println("결과을 찾지 못했습니다.");
			} else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}
		}

		System.out.println("-프로그램 끝-");
		sc.close();
	}
}

class Articles {
	String id;
	String title;
	String contents;
}
