// 자바 => 한개의 클래스에서 작업하지 않는다
// 클래스 여러개를 만들어서 연관관계
// 모든 프로그램 => Actor
/*
 * 	선택에 따라 출력 내용 변경
 * 	--------------------
 * 	true / false 를 나눠서 작업
 * 	=> 로그인을 성공 / 실패
 * 	
 * 	형식)
 * 		if(조건문) => true 예) 짝수라면 , 대문자
 * 		{
 * 			문장
 * 		}
 * 		else => false 홀수, 소문자, 로그인 안된 경우...
 * 		{
 * 			문장 => 예약 기간이 아니라면
 * 		}
 */
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println(num + "는(은) 짝수입니다.");
		}
		else {
			System.out.println(num+"는(은) 홀수입니다.");
		}
	}

}
