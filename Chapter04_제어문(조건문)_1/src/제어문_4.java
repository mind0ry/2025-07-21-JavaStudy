// 입력을 받아서 로그인 처리
// id, pwd => 오라클에서 처리
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 임의로 ID,PWD 설정
		final String ID = "admin";
		final String PWD = "1234";
		// final : 상수 => 상수는 변수와 구분 => 모든 키워드를 대문자로 설정
		System.out.print("아이디 입력:");
		String id = scan.next();
		
		System.out.print("비밀번호 입력:");
		String pwd = scan.next();
		
		if (id.equals(ID) && pwd.equals(PWD)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

}
