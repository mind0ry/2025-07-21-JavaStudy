package com.sist.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Sawon {
	private String name;
	public Sawon() {}
	public Sawon(String name) {
		this.name=name;
	}
	public void sayHello() {
		System.out.println("Sawon:sayHello Call..."+name);
	}
}
public class 라이브러리_리플렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class cls=Class.forName("com.sist.ref.Sawon");
			Constructor con=cls.getConstructor();
			Object obj=con.newInstance();
			Constructor con2=cls.getConstructor(String.class);
			Object obj2=con2.newInstance("홍길동");
			Method m=cls.getMethod("sayHello");
			m.invoke(obj);
			m.invoke(obj2);
		} catch(Exception ex) {
			ex.printStackTrace(); // 예외 확인
		}
	}

}
