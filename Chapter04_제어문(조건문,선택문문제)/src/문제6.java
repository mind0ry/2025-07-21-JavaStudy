// 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int change = (int)(Math.random()*2);
		char c = ' ';
		if (change == 0) {
			c = (char)((Math.random()*26) + 65);
		} else {
			c = (char)((Math.random()*26) + 97);
		}
		
		System.out.println(c);
		if ('A' <= c && c <= 'Z') {
			System.out.println("대문자입니다");
		} else {
			System.out.println("소문자입니다");
		} 
	}

}
