/*
 * 	1. 사용자 입력 -> 메소드 (중복 제거) => 기능
 * 	2. 입력 처리 -> 메소드 => 재사용
 * 	   -------
 * 	3. 굙허겂 츌룍 -> 메소드
 */


import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1~10사이의 정수 입력:");
		int score = scan.nextInt();
		//10~9 => A , 8 => B , 7 => C , 6 => D F 
//		switch (score) {
//			case 10:
//			case 9:
//				System.out.println("A");
//				break;
//			case 8:
//				System.out.println("B");
//				break;
//			case 7:
//				System.out.println("C");
//				break;
//			case 6:
//				System.out.println("D");
//				break;
//			default:
//				System.out.println("F");
//		}
			switch (score) {
			
			case 10, 9 -> {
				System.out.println("A");
			}
			case 8 -> {
				System.out.println("B");
			}
			case 7 -> {
				System.out.println("C");
			}
			case 6 -> {
				System.out.println("D");
			}
			default -> {
				System.out.println("F");
			}
		}
	}

}
