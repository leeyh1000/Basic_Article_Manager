import java.util.Scanner;

public class Main {
	//콘솔 게시판
	public static void main(String[] args) {
		System.out.println("-프로그램 시작-");		
		Scanner sc = new Scanner(System.in);
		String cmd = sc.nextLine();
		System.out.println("입력 명령어 : "+cmd);
		System.out.println("-프로그램 끝-");
		sc.close();
	}

}
