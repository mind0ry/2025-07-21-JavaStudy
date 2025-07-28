// 문자 1개 입력 => 대문자, 소문자, 숫자, 한글

import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자하나 입력: ");
		String s = scan.next();
		char c = s.charAt(0);
		
		if ('A' <= c && c <= 'Z') {
			System.out.println("대문자 입니다");
		} else if ('a' <= c && c <= 'z') {
			System.out.println("소문자 입니다");
		} else if ('0' <= c && c <= '9') {
			System.out.println("숫자 입니다");
		} else {
			System.out.println("알파벳이나 숫자가 아닌 문자입니다");
		}
	}

}
