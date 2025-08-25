package com.sist.set;
import java.util.*;
public class Set_3 {
// TreeSet
/*
 * 		Set
 * 		 |
 * 	 -----------
 * 	 |			|
 * HashSet 	  TreeSet => 인터페이스 구현
 * 
 * 	** 인터페이스는 메모리 할당이 불가능
 * 	Set set=new Set()
 * 			--------- 구현된 클래스
 * 	Set set=new HashSet()
 * 	Set set=new TreeSet()
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		for(int i=0;i<10;i++) {
			int r=(int)(Math.random()*100)+1;
			set.add(r);
		}
		
		System.out.println("===== 저장된 데이터 =====");
		System.out.println("저장된 개수:"+set.size());
		for(Object obj:set) {
			System.out.print(obj+" ");
		}
		System.out.println();
		// 출력 => 50보다 작은 수
		for(Object obj:set) {
			int a=(int)obj;
			if(a<50) {
				System.out.print(obj+" ");
			}
		}
		System.out.println();
		
		for(Object obj:set) {
			int a=(int)obj;
			if(a>50) {
				System.out.print(obj+" ");
			}
		}
		System.out.println();
		// 검색이 빠르게 / 정렬 => TreeSet
		System.out.println("===== TreeSet =====");
		TreeSet tSet=new TreeSet();
		// headSet, tailSet => Set에는 없는 메소드
		// TreeSet만 가지고 있는 메소드
		/*
		 * 	상속
		 * 		상속을 내리는 클래스 => 내리기만 한다
		 * 			상속을 받는 클래스 => 접근이 불가능
		 * 		상속을 받는 클래스
		 * 
		 * 	인터페이스도 클래스 => implements 상속이다
		 * 	-------   ----
		 * 		|		|
		 * 		---------
		 * 		  다중 상속
		 */
		for(int i=0;i<10;i++) {
			int r=(int)(Math.random()*100)+1;
			tSet.add(r);
		}
		System.out.println("===== 저장된 데이터 =====");
		System.out.println("저장된 개수:"+tSet.size());
		for(Object obj:tSet) {
			System.out.print(obj+" ");
		}
		System.out.println();
		System.out.println("50보다 작은 수:"+tSet.headSet(50));
		System.out.println("50보다 큰 수:"+tSet.tailSet(50));
	}

}
