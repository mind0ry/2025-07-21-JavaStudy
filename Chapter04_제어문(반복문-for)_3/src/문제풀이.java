import java.util.Scanner;
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 1; i <= 6; i++) {
//			int sum = 0;
//			for (int j = 1; j <= 6; j++) {
//				sum = i + j;
//				if (sum == 6) {
//					System.out.printf("%d, %d" , i, j);
//					System.out.println();
//				}
//				
//				
//			}
//		}
//		Scanner scan = new Scanner(System.in);
//		
//		int a, b = 0;
//		for (;;) {
//			System.out.print("두 개의 정수 입력 (1 2):");
//			a = scan.nextInt();
//			b = scan.nextInt();
//			
//			if(a >= b) {
//				System.out.println("첫번째 정수가 더 작아야함");
//				continue;
//			} else {
//				break;
//			}
//		}
//
//		int gop = 1;
//		for (int i = a; i<=b; i++) {
//			gop *= i;
//		}
//		
//		System.out.printf("%d 부터 %d의 곱: %d", a, b, gop);
		
		
//		int sum = 0;
//		for(int i = 0; i <= 100; i++) {
//			if (i % 4 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
//		int total1 = 0;
//		int total2 = 0;
//		for (int i = 1; i <= 10; i++) {
//			Scanner scan = new Scanner(System.in);
//			System.out.print("정수입력:");
//			int num = scan.nextInt();
//			if (num % 3 == 0) {
//				total1++;
//			}
//			if (num % 5 == 0) {
//				total2++;
//			}
//		}
//		System.out.println("5의배수 개수:"+total1);
//		System.out.println("3의배수 개수:"+total2);
//		
//		
		
		for (int i = 1; i <= 5; i++) {
			char c = 'A';
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
		
	}
}
		
		
