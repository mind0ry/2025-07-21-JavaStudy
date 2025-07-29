// 변수의 사용범위 => 지역변수 : 메모리 자체에서 생성/소멸
// {} 안에서만 사용이 가능

public class 제어문_3 {
	// 다른 클래스에서 사용이 가능한 영역
	public static void main(String[] args) {
		// 지역변수 단점 => 다른 클래스에서 사용이 불가능
		// TODO Auto-generated method stub
		for (int i = 0; i < 26; i ++) {
			char c = 'A'; // 생성 = 소멸 ... 26번
			System.out.print(c++);
		}
	}

}
