
public class 제어문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지 합
		//지역변수 => scope => 범위
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		} // i는 메모리에서 사라진다
		System.out.println("for => sum = " + sum);
		
		int i = 1;
		sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("while => sum = " + sum);
		
		i = 1;
		sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("do~while => sum = " + sum);
	}

}
