/*
 * 	break => 반복을 종료할 때 사용
 * 	  | => for , while , do~while , switch
 * 		=> if문에서는 사용이 안된다
 * 
 * 		종료 => break, return, System.exit(0)
 * 
 * 		특정 부분을 제외하고 프로그램 유지 , 처음부터 다시 실행
 * 			continue : for , while , do~while
 * 			=> for => 증가식 이동
 * 			=> while => 조건식으로 이동 : 무한루프일 경우가 많다
 * 
 * 			** break와 continue는 자신의 반복문에서만 가능
 * 
 * 			
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3; j++) {
//				//if (j == 2) break;
//				System.out.println("i=" + i + ",j=" + j);
//			}
//			break;
//		}
		for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4 || i == 5) continue;
			System.out.println(i);
		}
	}

}
