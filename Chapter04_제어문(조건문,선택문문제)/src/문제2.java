// 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 한 개 입력: ");
		int num = scan.nextInt();
		
		if (num % 3 == 0) {
			if (num ==0) {
				System.out.println("0을 입력하였습니다");
			} else {
				System.out.println("3의 배수 입니다");
			}
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
	}

}
