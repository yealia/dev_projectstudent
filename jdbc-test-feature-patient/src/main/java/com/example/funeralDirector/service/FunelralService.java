package main.java.com.example.funeralDirector.service;

import java.util.ArrayList;

import main.java.com.example.funeralDirector.model.dao.FunelralDao;
import main.java.com.example.funeralDirector.model.dto.FunelralDto;
import main.java.com.example.funeralDirector.view.FuneralDirectorMenu;

public class FunelralService {
	FunelralDao funelralDao = new FunelralDao(0, null, null, 0);
	//컨트롤러에서 서비스 건들였으니 서비스 -> dao 건드렬려
	
	//사망자 select
	public void checkDeath() {
		FuneralDirectorMenu menu = new FuneralDirectorMenu();
		
		ArrayList<FunelralDto> fdList = funelralDao.selectAll();
		if(!fdList.isEmpty()) {
			menu.DeathList(fdList);
		}else {
			menu.DeathError("해당되는 데이터가 없습니다");
		}
		
	}
	
	//사망자 insert
	public int createDeath (FunelralDto funelralDto) {
		return funelralDao.insert(funelralDto);
	}
	
	//사망자 한명만 select
//	public void checkOneDeath(FunelralDto funelralDto){		
//		FunelralDto funelralDto = funelralDao.findByFunelralId(resNo);
//		if(funelralDto == null) {
//			System.out.println("log warning: 사망자 명단에 없습니다");
//			return;
//		}
//	}
	
	
}
