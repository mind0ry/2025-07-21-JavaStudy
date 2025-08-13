package com.sist.main;
/*
 * 	상속
 * 		= 재사용 기법
 * 		= 코드를 간결하게
 * 		= 신뢰성이 뛰어나다 (검증된 클래스를 이용)
 * 		= 한개의 클래스만 상속 => 단일상속
 * 		= 기능을 변경해서 사용이 가능 (오버라이딩)
 * 		= 라이브러리 상속이 많다
 * 		= 개발시간이 단축
 * 		예) 
 * 			지니뮤직
 * 			  |
 * 			 멜론
 * 
 * 			알라딘
 * 			  |
 * 			Yes24
 * 
 * 		단점) 결합성이 높아진다
 * 			 ---- 클래스를 수정 => 다른 클래스에 영향
 * 			 ---- 개발에 제약이 많다
 * 					| 메소드가 동일
 * 			 메모리가 비대 => 메모리 누수현상
 * 			 상속내리는 클래스의 모든 내용을 파악 => .jar *.class
 * 		=>호불호
 * 		--------------------------------------------------
 * 		기본 구조
 * 		class 상속받는 클래스 extends 상속내리는 클래스
 * 		{
 * 			// => 상속받은 변수 / 메소드
 * 					상속이 안되는 것 : static / 생성자 / 초기화 블록
 * 					상속은 되는데 접근거부 : private
 * 	
 * 		}
 * 
 * 		정의 : 기존의 클래스로부터 상속을 받아서 확장된 새로운 클래스를 작성
 * 			  ---------                ---------------
 * 		
 * 		=> 코드 중복 제거
 * 		=> 한개를 가지고 여러개 표현이 가능
 */

class A {
	public void aaa() {
		System.out.println("aaa() Call");
	}
	
	public void bbb() {
		System.out.println("bbb() Call");
	}
}

class B extends A {
	A a=new A() {
		public void aaa() {
			System.out.println("B:aaa() Call");
		}
		
		public void bbb() {
			System.out.println("B:bbb() Call");
		}
	};
	
	public void ccc() {
		System.out.println("B:bbb() Call");
	}
}

public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
	}

}
