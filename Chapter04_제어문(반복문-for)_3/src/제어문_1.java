/*
 * 	이차 for문 => 형식 => 동작 순서
 * 	---------
 * 	
 * 	형식) 	   1    2 | false => 종료
 * 		for (초기값;조건식;증감식)	 _
 * 		{			|			  |
 * 					| true		  |	
 * 				 3     4   false --
 * 							5
 * 			for(초기값;조건식;증감식)  |
 * 			{		   |		  |
 * 					   | true	  |
 * 				실행문장 5-----------	
 * 			}
 * 		}
 * 
 * 		1차 for => 줄수
 * 		2차 for => 실제 내용 출력
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== 구구단 =====");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d  ", i, j, i*j);
			}
			System.out.println();
		}
	}

}
