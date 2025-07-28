// 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성
// 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F
// switch

import java.util.Scanner;

public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 수학 영어 점수 입력(90 90 90): ");
		int kor = scan.nextInt();
		int math = scan.nextInt();
		int eng = scan.nextInt();
		
		int total = kor + math + eng;
		double avg = total / 3.0;
		
		int level = (int) avg / 10;

		switch (level) {
		    case 10, 9 -> {
		    	System.out.println("학점 : A");
		    }
		    case 8 -> {
		    	System.out.println("학점 : B");
		    }
		    case 7 -> {
		    	System.out.println("학점 : C");
		    }
		    case 6 -> {
		    	System.out.println("학점 : D");
		    }
		    default -> {
		    	System.out.println("학점 : F");
		    }
		}

	}

}
