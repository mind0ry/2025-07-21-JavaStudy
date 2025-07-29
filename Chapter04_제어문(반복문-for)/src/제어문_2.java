/*
 * 	어디서부터 어디까지 반복 수(증감/감소)
 * 		   1    2    4
 * 	for (초기값;조건식;증감식)
 * 	{
 * 		반복 수행문장 3
 * 	}
 * 
 * 	=> 반복 횟수가 있다
 * 	=> Front-End : for => Back-End : while
 * 	--------------------------------------
 * 					| 2차 for문
 * 					  -------- 알고리즘
 * 
 * => 1~100 => 합 / 짝수 합 / 홀수 합
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, even = 0, odd = 0;
		// 합 => 초기값은 0부터 시작 , 곱 => 초기값은 1부터 시작
		for(int i = 1; i <= 100; i++) {
			sum += i; // sum = sum + i;
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println("1~100까지의 총합: " + sum);
		System.out.println("1~100까지의 짝수합: " + even);
		System.out.println("1~100까지의 홀수합: " + odd);
		
		int three = 0, five = 0, seven = 0;
		
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				three += i;
			}
			if (i % 5 == 0) {
				five += i;
			}
			if (i % 7 == 0) {
				seven += i;
			}
		}
		
		System.out.println("3의 배수: " + three);
		System.out.println("5의 배수: " + five);
		System.out.println("7의 배수: " + seven);
	}
	// 3의 배수 합, 5의 배수 합, 7의 배수 합
	
}
