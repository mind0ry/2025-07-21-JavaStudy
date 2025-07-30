/*
 * 	2차 for 
 * 	-------
 * 
 * 	형식)
 * 		for() {       	=> 줄수 => rows
 * 			for() {
 * 				실행 문장 => 화면 출력 => cols
 * 			}
 * 		}
 * 
 * 	i	j
 * 줄수 별수
 *  1	1
 *  2	2
 *  3	3
 *  4	4 => i==j => j는 i만큼
 *  -------------------------
 *  	for(int i=1;i<=4;i++)
 *  	{
 *  		for(int j=1;j<=(i);j++)
 *  	}
 * 
 * 		*
 * 	   ***
 * 	  *****
 *   *******
 *    *****
 *     ***
 *      *
 *  ----------    
 *    *****
 *     ***
 *     	*
 *     ***
 *    *****
 *  ----------
 *    *   *
 *    ** **
 *    *****
 *    ** **
 *    *   *
 *  ----------  
 *    
 *    	
 */	
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
//		
//		*
//		**
//		***
//		****
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 5-i; j++) {
//				System.out.print("*");
//			}
//		System.out.println();
//		}
//		
//		****
//		***
//		**
//		*
		/*
		 * 		 i    j    k
		 * 		줄수  공백  별표
		 * 		1	  3	   1
		 * 		2     2	   2	
		 * 		3     1	   3
		 * 		4     0    4
		 * 
		 * 		i+j=4 => j=4-i 별표 => k=i
		 */
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.println("*");
//			}
//			System.out.println();
//		}
		
		/*
		 * 		 i    j    k
		 * 		줄수  공백  별표
		 * 		1	  0	   4
		 * 		2     1	   3	
		 * 		3     2	   2
		 * 		4     3    1
		 * 
		 * 		i=j+1 => j=i-1     별표 => i+k=5 => k=5-i
		 */
		
		for (int i = 1; i <= 4; i++) {
		    for (int j = 1; j <= i - 1; j++) {
		        System.out.print(" ");       
		    }
		    for (int k = 1; k <= 5 - i; k++) {
		        System.out.print("*");       
		    }
		    System.out.println();              
		}
		
	
	}
	
	

}
