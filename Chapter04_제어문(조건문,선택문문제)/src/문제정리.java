/*
 * 
 * 	1. 형식
 * 		단일 조건문 
 * 		if (조건문) => 검색 , 로그인 , 아이디 찾기
 * 					  비밀번호 찾기 , 아이디 중복체크
 * 					  아이디저장 , 자동 로그인
 * 		   ------ 부정연산자 , 비교연산자 , 논리연산자
 * 		   ------ equals(같다) , contains(포함)
 * 		   ------ startsWith(시작문자) , endsWith(끝문자열)
 * 		   ------ !equals()
 *  	{
 *  		실행문장	=> 조건문이 TRUE일 경우에만 실행
 *  					FALSE면 건너뛴다
 *  	}
 *  
 */
import java.util.Calendar;
import java.util.Scanner;
public class 문제정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.print("년도 입력:");
	int year = scan.nextInt();
	
	System.out.print("월 입력:");
	int month = scan.nextInt();
	
	System.out.print("일 입력:");
	int day = scan.nextInt();
	
	Calendar cal1 = Calendar.getInstance();
	//메모리 저장
	// 날짜 지정
	cal1.set(Calendar.YEAR, year);
	cal1.set(Calendar.MONTH, month-1);
	cal1.set(Calendar.DATE, day);
	
	int w = cal1.get(Calendar.DAY_OF_WEEK);
	String s = "";
	switch(w) {
	case 1:
		s="일"; break;
	case 2:
		s="월"; break;
	case 3:
		s="화"; break;
	case 4:
		s="수"; break;
	case 5:
		s="목"; break;
	case 6:
		s="금"; break;
	case 7:
		s="토"; break;
	}
	
	System.out.printf("🤡🤡🤡🤡🤡 %d년 %02d월 %02d일 %s요일🤡🤡🤡🤡🤡\n\n", year, month, day, s);
	
	System.err.print("일\t");
	System.out.print("월\t");
	System.out.print("화\t");
	System.out.print("수\t");
	System.out.print("목\t");
	System.out.print("금\t");
	System.err.print("토");
	System.out.println();
	
	Calendar cal = Calendar.getInstance();
	//메모리 저장
	// 날짜 지정
	cal.set(Calendar.YEAR, year);
	cal.set(Calendar.MONTH, month-1);
	cal.set(Calendar.DATE, 1);
	
	int week = cal.get(Calendar.DAY_OF_WEEK); 
	//요일 (1번 시
	week = week - 1;
	int lastday = cal.getActualMaximum(Calendar.DATE);
	
	for(int i=1;i<=lastday;i++) {
		if(i==1) {
			for(int j=0;j<week;j++) {
				System.out.print("\t");
			}
		}
		if(i==day) {
			System.err.printf("%02d\t",i);
		} else {
			System.out.printf("%02d\t",i);
		}
		
		week++;
		if(week>6) {
			week=0;
			System.out.println();
		}
		
	}
	
	
	}

}
