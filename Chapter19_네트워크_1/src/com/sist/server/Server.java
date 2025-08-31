package com.sist.server;
import java.util.*;

import com.sist.commons.Function;

import java.net.*;
import java.io.*;
/*
 * 	쓰레드 => 프로그램 1개에서 여러개 메소드가 동시에 호출
 * 	---- 메소드 호출
 * 	  | 접속마다 따로 서버가 동작을 한다 (멀티 쓰레드)
 * 
 * 	서버
 * 		1. 대기 소켓을 생성 ServerSocket
 * 			= bind => ip/port 연결
 * 					  (ip => 전화번호 , port => 연결선)
 * 					  => 유심
 * 			= listen => 대기
 * 		2. 접속시 처리
 * 			= 쓰레드로 처리
 * 			= accept() : 클라이언트가 접속시에만 호출
 * 			  --------> 클라이언트 정보 저장
 * 		----------------------------------------------
 * 		3. 클라이언트와 통신 
 * 			case ....
 * 		----------------------
 * 
 * 		네트워크 
 * 	------
 * 	 서버
 * 		=> 기능
 * 		=> 접속 처리
 * 		=> 요청 처리
 * 			= 검색
 * 			= 저장
 * 			= 삭제
 * 			= 수정
 * 		클래스 다이어그램 (클래스:객체지향 설계 => SOLID)
 * 		-------------
 * 		   Server => 클래스명
 * 		-------------
 * 			변수
 * 			- ss:ServerSocket
 * 			- PORT:int
 * 			- waitVc:Vector
 * 		-------------
 * 			메소드
 * 			+ Server() => 서버 가동
 * 			+ run:void => 접속시 처리
 * 		-------------
 * 			|
 * 			| 포함 클래스
 * 		  ---------
 *  		Client
 *  	  ---------
 *   		변수
 *   		id:String
 *   		name:String
 *   		address:String
 *   		pos:String
 *   		s:Socket;
 *   		in:BufferedReader; // 접속자 요청
 *   		out:OutputStream;
 *        ---------
 *        	+Client(Socket s) : 쓰레드 연결 => 클라이언트마다 따로 통신
 *        	+run:void : 쓰레드 통신 (클라이언트와 연동)
 *        		=> case 문장 이용
 *        	+messageTo(String msg):void : 반복 제거 => 한명에게 데이터 전송
 *        	+messageAll(String msg):void : 접속자 모두에게 전송
 *        ---------
 *        ------
 *        Server : 서버역할 , 클라이언트 연결 관리 , 메세지 전송
 *        Client : 각 클라이언트 연결 => 요청 처리
 *        ------
 *        Client : 응답을 받아서 화면에 출력
 *
 * 		클라이언트
 */
public class Server implements Runnable {
	private ServerSocket ss; // 대기 소켓 , 교환 소켓
	private final int PORT=6666;
	// 접속자 저장 공간 => 동기화
	private Vector<Client> waitVc=new Vector<Client>();
	
	// 1. 서버 가동 => 대기 상태 (접속시까지 기다린다)
	public Server() {
		try {
			ss=new ServerSocket(PORT); //50명
			System.out.println("Server Start...");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	// 2. 접속시에 처리 => 쓰레드로 처리
	
	public void run() {
		// 쓰레드 동작을  구현하는 메소드
		try {
			while(true) {
				Socket s=ss.accept();
				// 접속자의 IP / PORT
				Client client=new Client(s);
				// 접속자와 통신을 시작해라
				client.start();
			}
		} catch (Exception ex) {}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구동
		Server server=new Server();
		// 쓰레드를 이용해서 => 접속자 관리 시작
		new Thread(server).start();
	}
	class Client extends Thread {
		// 접속자의 정보 받기
		String id,name,address,pos;
		Socket s;
		BufferedReader in; // 접속자 요청
		// HttpServletRequest
		OutputStream out; // 접속자 요청 처리에 대한 응답
		// HttpServletResponse
		public Client(Socket s) {
			try {
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
			} catch (Exception ex) {}
		}
		// 실제 통신
		public void run() {
			try {
				// 100|id|name|addr
				while(true) {
					String msg=in.readLine();
					// 클라이언트로부터 받은 값
					System.out.println("Client전송값 =>"+msg);
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					
					switch(protocol) {
					
						case Function.LOGIN:
						{
							// 정보를 받는다
							id=st.nextToken();
							name=st.nextToken();
							address=st.nextToken();
							pos="대기실";
							// LOGIN => 테이블 출력
							
							// 현재 접속되어 있는 모든 Client에 전송
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+pos);
							// 입장 메세지 전송
							// => 채팅창에 출력
							messageAll(Function.WAITCHAT+"|[알림 👉]"+name+"님 입장하셨습니다|red");
							// 로그인되는 사람 => 정보 받기
							waitVc.add(this);
							// 1. 로그인창 => 대기실창으로 변경
							messageTo(Function.MYLOG+"|"+id+"|"+name);
							// 2. 이미 접속한 사람의 정보를 전송
							for(Client c:waitVc) {
								messageTo(Function.LOGIN+"|"+c.id+"|"+c.name+"|"+c.pos);
							}
							// 3. 개설된 방 정보 전송
						}
						break;
						case Function.WAITCHAT:
						{
							String m=st.nextToken();
							String color=st.nextToken();
							messageAll(Function.WAITCHAT+"|["+name+"] "+m+"|"+color);
						}
						break;
						case Function.CHATEND:
						{
							messageAll(Function.WAITCHAT+"|[알림 👉]"+name+"님이 퇴장하셨습니다|red");
							messageAll(Function.CHATEND+"|"+id);
							messageTo(Function.MYEND+"|");
							
							for(Client c:waitVc) {
								if(c.id.equals(id)) {
									waitVc.remove(c);
									in.close();
									out.close();
									break;
								}
							}
						}
						break;
						case Function.INFO:
						{
							String youId=st.nextToken();
							for(Client user:waitVc) {
								if(user.id.equals(youId)) {
									messageTo(Function.INFO+"|"+user.id+"|"+user.name+"|"+user.address);
									break;
								}
							}
						}
					}
				}
			} catch (Exception ex) {}
		}
		// 기능 => 전송하는 방법
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
			} catch (Exception ex) {}
		}
		public synchronized void messageAll(String msg) {
			try {
				for(Client client:waitVc) {
					client.messageTo(msg);
				}
			} catch (Exception ex) {}
		}
	}
}
