/*
 * 1. 알파벳을 입력 받아서
 * 		= 대문자
 * 		= 소문자
 * 		= 알파벳이 아님
 * 
 * 
 * 
 * 		변수 => 응용 (연산자) => 응용 (제어문) => 응용 => 메소드
 * 												  ----
 * 												  여러개 몪음 
 * 													클래스
 */
import java.util.*;
public class 제어문_조건문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		String b = scan.next();
		char a = b.charAt(0);
		
		
		System.out.println("====== 결과값 ======");
		if (a >= 'A' && a <= 'Z') {
			System.out.println(a + "는(은) 대문자입니다");
		}
		if (a >= 'a' && a <= 'z') {
			System.out.println(a + "는(은) 소문자입니다");
		}
		if (!((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z'))) {
			System.out.println(a + "알파벳이 아닙니다");
		}
	}
}
