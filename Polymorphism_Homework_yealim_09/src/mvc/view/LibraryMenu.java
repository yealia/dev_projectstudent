package mvc.view;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        Scanner sc =new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요");
        char gender = sc.next().charAt(0);

        Member member = new Member(name,age,gender);
        lm.insertMember(member);

        while (true){
            System.out.println("====메뉴====");
            System.out.println("1.마이페이지");
            System.out.println("2.도서전체조회");
            System.out.println("3.도서 검색");
            System.out.println("4.도서 대여하기");
            System.out.println("0.프로그램 종료하기");
            System.out.println("번호를 입력하세요");
            int menun= sc.nextInt();
            switch (menun){
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    return;
            }
        }



    }
    public void selectAll(){

        Book[] bList =lm.selectAll();

       for (int i=0; i<bList.length; i++){
           System.out.println(i+" 번 도서: "+bList[i]);
       }
    }
    public void searchBook(){
        String keyword = sc.next();
        Book[] searchList = lm.searchBook(keyword);
        for (Book book : searchList) {
            System.out.println(book);
        }
    }
    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서번호 선택 :");
        int num = sc.nextInt();
        int result = lm.rentBook(num);
        if(result ==0){
            System.out.println("성공적으로 대여되었습니다");
        }else if(result == 1){
            System.out.println("나이제한으로 대여 불가능");
        }else if(result ==2){
            System.out.println("성공적으로 대여되었습니다" +
                    "요리학원 쿠폰이 발급되었습니다 마이페이지를 통해 확인하세요");

        }
    }

}
