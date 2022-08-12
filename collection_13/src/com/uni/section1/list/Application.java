package com.uni.section1.list;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> linkedList =new LinkedList<>();

        linkedList.add("apple");

        /*요소를 추가할 때 add를 이용*/
        linkedList.add("shine");
        linkedList.add("yea");
        linkedList.add("rim");
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        //for문과 size()를 이요해서 반복문을 활용할 수도 있다
        for (int i=0; i<linkedList.size(); i++){
            System.out.println(i+":"+linkedList.get(i));
        }
        //linkedList 요소 제거할때
        linkedList.remove(1);
        System.out.println(linkedList);
        //향상된 for문 사용도 가능하다
        for(String s: linkedList){
            System.out.println(s);
        }
        linkedList.set(0,"yealia");


    }
}
