/*
 * 	정수 2개 입력
 * 	연산자 입력
 * 	+ - * / ==> 사직연산
 * 	------- 다중 조건문
 */
import java.util.*;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		System.out.print("연산자 입력(+ , - , * , /): ");
		String strOp = scan.next();
		char op = strOp.charAt(0); // 인덱스로 char 변환
		// Scanner / BufferedReader => char 입력이 없다
		System.out.print("두번째 정수 입력: ");
		int num2 = scan.nextInt();
		
		System.out.println("=====입력값=====");
		System.out.println("정수1 :" + num1);
		System.out.println("연산자 :" + op);
		System.out.println("정수2 :" + num2);
		
		if (op == '+') {
			System.out.println(num1 + num2);
		} else if (op == '-') {
			System.out.println(num1 - num2);
		} else if (op == '*') {
			System.out.println(num1 * num2);
		} else if (op == '/') {
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			} else {
				System.out.println(num1 / (float)num2);
			}
		} else 
			System.out.println("잘못 입력된 연산자입니다!");
	}
	/*
	 * 	if => 조건문
	 * 			1) 오류 처리
	 * 			2) 상세보기
	 * 			3) 검색
	 * 			4) 게임 => 키보드 입력에 따라 처리 변경
	 * 			5) 네트워크 : 내부 프로토콜
	 * 				클라이언트 => 100 서버 => 로그인
	 * 				-------------------------- 
	 */
}
