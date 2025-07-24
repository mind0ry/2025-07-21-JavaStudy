// 비트 이동 연산자
// << 왼쪽 , >> 오른쪽 이동
/*
 * 	4<<2 == 16	==> 0을 두개 붙인다
 * 	x<<y == x*2^y
 * 	4>>1 == 1	==> 0을 두개 제거
 * 	x>>y == x/2^y  => 4/4 = 1
 * 
 * 	6>>2 110 ==> 1 => 1
 * 
 * 
 */
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(27));
		System.out.println(27<<2);
	}

}
