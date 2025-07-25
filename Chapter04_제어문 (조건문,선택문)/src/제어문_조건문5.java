/*
 *  국어 영어 수학 점수 입력
 *  -----------
 *  평균 출력 , 총점 출력, 학점 출력
 */

import java.util.Scanner;
public class 제어문_조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력(90 90 90) : ");
		int kor = scan.nextInt();
		int math = scan.nextInt();
		int eng = scan.nextInt();
		
		int total = kor + math + eng;
		System.out.println("총점 : " + total);
		double avg = total / 3.0;
		System.out.println("평균 점수 : " + avg);
		
//		if (90 <= avg && avg <= 100) {
//			System.out.println("A");
//		}
//		if (80 <= avg && avg <= 89) {
//			System.out.println("B");
//		}
//		if (70 <= avg && avg <= 79) {
//			System.out.println("C");
//		}
//		if (60 <= avg && avg <= 69) {
//			System.out.println("D");
//		}
//		if (avg <= 59) {
//			System.out.println("F");
//		}
		int temp=(total/3)/10;
		if(temp == 10 || temp == 9) {
			System.out.println("A학점");
		}
		if(temp==8) {
			System.out.println("B학점");
		}
		if(temp==7) {
			System.out.println("C학점");
		}
		if(temp==6) {
			System.out.println("D학점");
		}
		if(temp<6) {
			System.out.println("F학점");
		}
	}

}
