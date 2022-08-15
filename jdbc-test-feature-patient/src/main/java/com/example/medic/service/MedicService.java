package main.java.com.example.medic.service;

import java.util.ArrayList;

import main.java.com.example.medic.model.dao.MedicDao;
import main.java.com.example.medic.model.dto.Medic;
import main.java.com.example.medic.view.MedicMenu;

public class MedicService {
	MedicDao medicDao = new MedicDao();

	// 재고 주문넣기
	// 컨트롤러에서 받은 medic정보를 dao(sql)로 전달
	public void insertPha(Medic medic) {
		medicDao.insert(medic);
	}

	public void checkPha() {
		// dao의 list값을 mediclist에 저장
		MedicMenu menu = new MedicMenu();

		ArrayList<Medic> medicList = medicDao.selectAll();

		if (!medicList.isEmpty()) { // 리스트 객체를 이미 만들었기 때문에 null이 될수 없어서 empty로 설정

			menu.displayMemberList(medicList);

		} else {

			menu.displayError("해당되는 데이터가 없습니다.");
		}

	}

	public  void updatePha(Medic medic) {

		medicDao.update(medic);

		
	}
}
