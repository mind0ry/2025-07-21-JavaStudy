/*
 * 	do~while :자바에서 사용 빈도가 없다
 * 	--------
 * 		| while의 단점 보완
 * 		  ----- 실행(x)
 * 		  ----- 반드시 한번 이상 수행
 * 		while : 먼저 조건 처리
 * 		do ~ while : 나중에 조건 처리
 * 
 * 		
 * 
 */
public class 제어문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for =====");
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("===== while =====");
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("===== do ~ while =====");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 10);
	}

}
