import java.util.*;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 영어 수학점수 입력 (90 90 90):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		//총점
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println("총점: " + total);
		System.out.printf("평균:%.2f\n",avg);
		
		if ((int)avg >= 60) {
			System.out.println("합격~~");
		} else {
			System.out.println("불합격~~");
		}
	}

}
