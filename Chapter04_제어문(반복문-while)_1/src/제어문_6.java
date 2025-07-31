// 계산기 => 종료 전 까지
import java.util.Scanner;
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("첫번째 정수 입력:");
			int num1 = scan.nextInt();
			
			System.out.print("연산자 입력(+,-,*,/):");
			String op = scan.next();
			
			System.out.print("두번째 정수 입력:");
			int num2 = scan.nextInt();
			
			switch(op) {
			case "+" -> {
				System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			}
			case "-" -> {
				System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			}
			case "*" -> {
				System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			}
			case "/" -> {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다");
				} else {
					System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
				}
			}
			default -> {
				System.out.println("잘못된 연산자입니다");
			}
			}
			/////////종료 조건
			System.out.print("종료할까요?(Y,y)");
			String s = scan.next();
			char c = s.charAt(0);
			if (c == 'Y' || c == 'y') {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
	}

}
