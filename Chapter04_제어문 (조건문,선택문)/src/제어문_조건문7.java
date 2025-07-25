/*
 * 60이상 합격
 * 60이하 불합격
 */
import java.util.Scanner;
public class 제어문_조건문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score = scan.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다");
		}
		if(score < 60) {
			System.out.println("불합격입니다");
		}
	}

}
