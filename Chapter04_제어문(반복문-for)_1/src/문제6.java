
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for(int i=0;i<=10;i++) {
			if (i % 2 == 0) {
				a -= i;
			}
			if (i % 2 == 1) {
				a += i;
			}
			
		}
		System.out.println("1-2+3..-10까지의 합:"+a);
	}

}
