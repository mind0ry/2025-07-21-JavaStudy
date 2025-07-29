/*
 * 	=> up down 게임
 *  => 난수 => 1 ~ 100 사이
 *  => 사용자 입력
 *  	=> 힌트 UP DOWN
 * 
 */
import java.util.Scanner;
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("===== for ======");
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i + " ");
//		}
//		System.out.println("===== break ======");
//		for (int i = 1; i <= 10; i++) {
//			if(i==5) break;
//			System.out.println(i + " ");
//		}
//		System.out.println("===== continue ======");
//		for (int i = 1; i <= 10; i++) {
//			if(i==5) continue;
//			System.out.println(i + " ");
//		}
		Scanner scan = new Scanner(System.in);
		
		
		int com = (int)(Math.random()*100) + 1;
		int count = 0;
		for(;;) {
			System.out.print("UP DOWN 게임 (1~100): ");
			int user = scan.nextInt();
			if (user < 1 || user > 100) {
				System.err.println("1~100까지 정수만 사용이 가능");
				continue;
			}
			count++; // 정상 입력 시에만
			if (user == com) {
				System.err.println("정답입니다");
				System.err.println("입력 횟수:" + count);
				break;
			} else {
				if (user < com) {
					System.out.println("UP");
				} else {
					System.out.println("DOWN");
				}
			}
			
		}
	}
}
