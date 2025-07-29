/*
 * 	for : 반복문 => 가장 많이 사용되는 반복문
 * 		=> 향상된 for : for-each구문 (웹에서 주로 사용)
 * 		=> 배열/컬렉션
 * 
 * 	형식)
 * 		for(초기값;조건식;증감식)
 * 		{
 * 			반복 수행문장 ==> 같은 형식 출력이 있는 경우
 * 		}
 * 
 * 	1. 초기값 : 시작점 => int i=1
 * 					   char c='A'
 * 		=> 배열 / 컬렉션 => 0
 * 	2. 조건식 : 끝점 : i<=10 i<=100
 * 	3. 증감식 : ++, --, +=, -=
 * 
 * 	동작
 * 	for(①초기값;②조건식;④증감식)
 * 	{
 * 				
 * 		반복수행문장 ③
 * 	}
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] names = {"홍길동", "심청이", "김두한", "박문수", "강감찬"};
//		for (int i = 0; i< names.length; i++) {
//			System.out.println(names[i]);
//		}
//		System.out.println("======");
//		// => 웹에서 목록 출력 => for
//		for (String name:names) {
//			System.out.println(name);
//		}
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(char c='A'; c<='Z'; c++) {
			System.out.print(c);
		}
		System.out.println();
		for(char c='Z'; c>='A'; c--) {
			System.out.print(c);
		}
	}

}
