/*
 * 
 */
import java.util.Scanner;
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		for (int i = 0; i < 6; i++) {
//			Scanner scan = new Scanner(System.in);
//			System.out.print("알파벳 입력:");
//			String s=scan.next();
//			char c=s.charAt(0);
//			if(c>='A' && c<='Z') {
//				System.out.println("변경값:"+(char)(c+32));
//			} else {
//				System.out.println("변경값:"+(char)(c-32));
//			}
//		}
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String s=scan.nextLine();
		int count = 0;
		for (int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			if(c =='A' || c=='a') {
				count++;
			}
		}
			System.out.println(count);
//			if(c>='a' && c<='z') {
//				System.out.print((char)(c-32));
//			} else {
//				System.out.print(c);
//			}
		
		// 문자열을 입력을 받아서 'A' | 'a' 의 개수 확인
	}

}
