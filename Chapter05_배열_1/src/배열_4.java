// 문자 저장
// 정수/문자열/실수
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0,cnt1=0;
		int big=0;
		int small=0;
		// 변수의 위치 => 누적 / 개수 => for밖에 설정
		char[] alpha=new char[15];
		for(int i=0;i<alpha.length;i++) {
			int a=(int)(Math.random()*2);
			
			if(a==0) {
				alpha[i]=(char)((Math.random()*26)+65);
				big++;
			} else {
				alpha[i]=(char)((Math.random()*26)+97);
				small++;
			}
			System.out.print(alpha[i]+" ");
			
			if(alpha[i]>='A' && alpha[i]<='Z') {
				cnt++;
			} else {
				cnt1++;
			}
		}
		System.out.println("\n소문자:"+small+", 대문자:"+big);
		System.out.println("\n소문자:"+cnt1+", 대문자:"+cnt);
	}

}
