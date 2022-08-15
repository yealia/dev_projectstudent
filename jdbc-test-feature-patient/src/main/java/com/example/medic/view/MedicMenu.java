package main.java.com.example.medic.view;

import java.util.List;
import java.util.Scanner;

import main.java.com.example.medic.controller.PharController;
import main.java.com.example.medic.model.dto.Medic;

public class MedicMenu {

    PharController Pharcontroller = new PharController();
    private final Scanner sc = new Scanner(System.in);
    private final PharController pc = new PharController();

    public void main() {
        while (true) {
            System.out.print("*** 재고관리***\n1. 총재고 확인하기\n2. 약이름 출력\n3. 기존재고 주문 넣기\n4. 신제품 넣기" +
                    "\n0. 끝내기\n메뉴 번호 선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:checkStock();
                    break;
                case 2:
                    break;
                case 3:
                   updateStock();

                    break;
                case 4: 약등록();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("올바른 메뉴번호를 선택하세요.");
                    break;
            }
        }
    }

    private void updateStock() {
 System.out.println("===== 주문등록 =====");
    	 
    	 System.out.println("제품 이름 입력");
    	 String phaName = sc.next();

    	 System.out.print("추가할 수량을 입력 : ");
         int phaStock = sc.nextInt();
         
    	
    	 Medic medic= new Medic(phaName, phaStock);
     	
//       Medic medic = new Medic(12, "두통약", "etc", 3000, 10);
       Pharcontroller.updatePha(medic);
    	
	}

	private void checkStock() {
        Pharcontroller.selectAll();

	}

	public void 약등록() {
    	 System.out.println("===== 주문등록 =====");
    	 
    	 System.out.println("약넘버");
    	 int phaNo = sc.nextInt();

    	 System.out.print("약이름 입력 : ");
         String phaName = sc.next();
         
         System.out.print("약타입 입력 : ");
         String phaType = sc.next();
         
         System.out.print("약가격 입력 : ");
         int phaPrice = sc.nextInt();
         
         System.out.print("약수량 입력 : ");
         int phaStock = sc.nextInt();

         Medic medic= new Medic(phaNo, phaName, phaType, phaPrice,phaStock);
    	
//        Medic medic = new Medic(12, "두통약", "etc", 3000, 10);
        Pharcontroller.발주(medic);

    }
	public void displayMemberList(List<Medic> list) {

		System.out.println("\n조회된 전체 회원정보는 다음과 같습니다.");
		System.out.println("\n아이디\t이름\t성별\t나이\t이메일\t전화번호\t주소\t취미\t가입일");
		System.out.println("----------------------------------------------------------");

		for (Medic m : list) {
			System.out.println(m);
		}

	}
	public void displayError(String message) {

		System.out.println("서비스 요청 실패 : " + message);
	}
}
