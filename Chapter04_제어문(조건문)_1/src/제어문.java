/*
 * 프로그램 : 순차적
 * 			위에서 아래 => 한줄씩 번ㅇ녁
 * 	프로그램의 종류
 * 		= 평문 : 일반 명령문만 수행 => HTML / CSS
 *  		=> 문법사항 (변수선언 , 연산처리 ..)
 *  	= 조건문 : 필요시에만 명령문을 수행
 *  			  상황에 따라서 다른 기능을 수행
 *  			  => 검색 (사이트) 
 *  			  => 상세보기
 *  			  => 로그인 처리 / 아이디 중복 / 아이디 찾기 / 비밀번호 찾기
 *  	1) 단일 조건문 (*****)
 *  		=> 독립적 조건문 하나하나 검색 => 속도가 늦다
 *  		=> 중복적으로 수행
 *  		=> 조건이 true일 때만 수행
 *  	2) 선택 조건문 (***)
 *  		=> 조건이 true / false
 *  		=> 웹에서 사용빈도가 많다
 *  	3) 다중 조건문: 메뉴
 *  	4) 중첩 조건문 
 *  
 *  1. 단일조건문 => 문법 / 형식
 
 */
public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		int max=a; // 임의의 초기화 => 1
		if(max<b) {
			max=b;
			System.out.println("max<b 문장 수행!!");
		}
		System.out.println("1.if문 건너뛰기...");
		if(max<c) {
			max=c;
			System.out.println("max<c 문장 수행!!");
		}
		System.out.println("2.if문 건너뛰기...");
		
		int min=a;
		if(min>b) {
			max=b;
		}
		if(min>c) {
			min=c;
		}
		System.out.println("min="+min);
		
	}

}
