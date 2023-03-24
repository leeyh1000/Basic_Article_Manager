package step1;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
	//콘솔 게시판
	public static void main(String[] args) {
		System.out.println("-프로그램 시작-");		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		Set<String> keySet = map.keySet();
		while(true) {
			System.out.printf("명령어 입력해 주세요: ");
			String cmd = sc.nextLine().trim();
			
			if(cmd.equals("exit")) {
				break;
			}else if(cmd.equals("article list")) {
				
				if(map.size() == 0) {//등록된 게시물이 없다면
					System.out.println("게시물이 존재하지 않습니다.");
				}else {
					for (String key : keySet) {
						System.out.println("==========");
			        	System.out.println("제목 : "+key);
			        	System.out.println("==내용==");
			        	System.out.println(map.get(key));
			        	System.out.println("==========");
			        }
				}		        
			}else if(cmd.equals("article write")) {
				System.out.printf("제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.printf("내용을 입력해주세요 : ");
				String contents = sc.nextLine();
				map.put(title, contents);
				
				System.out.printf("%d번 글이 생성되었습니다\n",map.size());
			}else if(cmd.equals("") || cmd.length()==0) {
				System.out.println("명령어를 입력해 주세요.");
			}else if(cmd.equals("article search")){
				int i =-1;
				System.out.printf("찾는 articel 제목 입력 : ");
				String keywords = sc.nextLine();
				for (String key : keySet) {
					if(key.equals(keywords)) {
						System.out.println("제목 : "+ key);
						System.out.println("=내용= ");
						System.out.println(map.get(key));
						i=1;
						break;
					}					
		        }
				if(i<0)	System.out.println("찾는 게시물이 없습니다.");	
				
			}else{
				System.out.println("존재하지 않는 명령어 입니다.");
			}
		}
	
		System.out.println("-프로그램 끝-");
		sc.close();
	}

}
