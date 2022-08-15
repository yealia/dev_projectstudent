package main.java.com.example.funeralDirector.model.controller;

import java.util.ArrayList;

import main.java.com.example.funeralDirector.model.dto.SubsidyDto;
import main.java.com.example.funeralDirector.service.SubsidyService;

public class SubsidyDaoController {
	//부조금 서비스 객체 선언해줘야 쓸 수 있지!!!
	private final SubsidyService subsidyService = new SubsidyService();
	//객체 선언한걸로 부조금 체크 가져와 !!
	public ArrayList<SubsidyDto> selectSubsidy() {
		return subsidyService.checkSubsidy();
	}
	
//	private int createSubsidy () {
//		
//	}
}
