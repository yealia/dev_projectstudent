package main.java.com.example.funeralDirector.model.controller;

import main.java.com.example.funeralDirector.model.dto.FunelralDto;
import main.java.com.example.funeralDirector.service.FunelralService;

public class FunelralController {
	// 컨트롤러 -> 서비스 -> dao -> db
	//서비스 가지와 
	private final FunelralService funelralService = new FunelralService();
	
	//아이디로 한 사망자만 조회
//	public void selectOne() {
//		funelralService.checkOneDeath(null);
//	}
	
	//사망자 insert
	//컨트롤러에서 받아서 서비스 건드려여여
	//컨트롤러는 서비스 호출만 하는 파일이다.
	public int registerDeath(FunelralDto funelralDto) {
		return funelralService.createDeath(funelralDto);
	}
	
	//총 사망자 검색
	public void selectAll() {
		funelralService.checkDeath();
		//System.out.println("======================");
	}
	
	
	
	
	
	
}
