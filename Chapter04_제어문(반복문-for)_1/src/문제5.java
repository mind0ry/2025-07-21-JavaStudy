
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for (int i = 1; i <= 30; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
					a++;
					if (a == 3) {
						System.out.println();
						a = 0;
					}
				}
				
			
		}
	}

}
