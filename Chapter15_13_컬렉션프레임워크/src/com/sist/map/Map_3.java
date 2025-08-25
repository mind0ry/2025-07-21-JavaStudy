package com.sist.map;
// => 클래스 관리자 
import java.util.*;
interface I {
	public void execute();
}
class A implements I {

	@Override
	public void execute() {
		System.out.println("A:execute() Call....");
	}
}
class B implements I {

	@Override
	public void execute() {
		System.out.println("B:execute() Call....");
	}
}
class C implements I {

	@Override
	public void execute() {
		System.out.println("C:execute() Call....");
	}
}
class D implements I {

	@Override
	public void execute() {
		System.out.println("D:execute() Call....");
	}
}
class Container {
	Map<String, Object> map=new HashMap<String, Object>();
	public Container() {
		map.put("a", new A()); 
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D()); // XML => id, class
	}
	// 클래스 찾기
	public Object getBean(String key) {
		return map.get(key);
	}
}
public class Map_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container ct=new Container();
		A a=(A)ct.getBean("a");
		a.execute();
		B b=(B)ct.getBean("b");
		b.execute();
		C c=(C)ct.getBean("c");
		c.execute();
		D d=(D)ct.getBean("d");
		d.execute();
	}

}
