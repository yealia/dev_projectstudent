package com.unit.first;//유사한 클래스를 묶어주는 패키지를 선언

public class HelloWorld {

	//주석 : 소스코드와 무관, 코드로 인식이 안됨 컨트롤 +
	/* 전체주석 :글을 적고 범위를 지정해서  컨트롤 + 쉬프트*/ 
	
	//public :메인 메소드는 외부에서 호출할수 있다.
	//static :객체를 생성하지 않고도 실행 시킬수 있다
	//void : 반환 값이 없다
	//String[] args : 파라미터, 실행명령어 외에 인자를 받을 수 있는데 스트링 배열로 들어간다.
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
		//System.out.println(args[0]);//hee1
		
		System.out.print("안녕하세요\n");
		System.out.print("안반가");
	}

}

