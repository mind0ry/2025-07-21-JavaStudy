// 로또 번호 6개 출력

public class 제어문_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 6; i++) {
			int lotto = (int)(Math.random()*45)+1;
			Thread.sleep(1000);
			System.err.println(lotto + " ");
		}
	}

}
