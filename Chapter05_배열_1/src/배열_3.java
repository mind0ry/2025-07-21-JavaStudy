// 100개의 난수 발생(0~9) => 빈도수 구하기
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bin=new int[10];
		for(int i=0;i<100;i++) {
			int rand= (int)(Math.random()*10);
			bin[rand]++;
		}
		System.out.println("===== 결과값 =====");
		for(int i=0;i<10;i++) {
			System.out.println(i+":"+bin[i]);
		}
	}

}
