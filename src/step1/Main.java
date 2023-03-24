package step1;
import java.util.Scanner;

public class Main {
	//콘솔 게시판
	public static void main(String[] args) {
		System.out.println("-프로그램 시작-");		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.printf("명령어 입력해 주세요: ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				break;
			}				
		}
	
		System.out.println("-프로그램 끝-");
		sc.close();
	}

}
