import java.util.Scanner;

public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "ABCDSADFSADFASDLJHUBSBVLK";
		System.out.println("문자의 총 개수: " + msg.length());
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 대문자 입력:");
		String s=scan.next();
		int index = 0;
		for(int i=0; i<msg.length();i++) {
			char c=msg.charAt(i);
			if(c==s.charAt(0)) {
				index=i;
				System.out.println(s+"는 " + (index+1) + "번째");
			}
		}
		
	}

}
