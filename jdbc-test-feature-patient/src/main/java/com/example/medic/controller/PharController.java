package main.java.com.example.medic.controller;

import main.java.com.example.medic.model.dto.Medic;
import main.java.com.example.medic.service.MedicService;

public class PharController {
	MedicService medicService = new MedicService();

	// 컨트롤러에서 insert된 정보를 받아서 서비스에다가 전달
	public void 발주(Medic medic) {
		
		System.out.println(medic);
		medicService.insertPha(medic);
	}

	// 리스트 값을 받았다.
	public void selectAll() {
//		MedicMenu menu = new MedicMenu();
		medicService.checkPha();
	}

// 
	public void updatePha(Medic medic) {
		// TODO Auto-generated method stub
		medicService.updatePha(medic);
	}
}
