package edu.kh.library.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BookService2 {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<LinkedHashMap<String, Object>> list = new ArrayList<LinkedHashMap<String, Object>>();
	
	int info=0;
	
	
	
	public void displayMenu() {
		int input = 0;
		
		do {
			System.out.println("디스플레이");
			System.out.println("메뉴 1 생성");
			System.out.println("메뉴 2 조회");
			System.out.println("메뉴 3 삭제");
			System.out.println("메뉴 0 종료");
			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: createMember(); break;
			case 2: viewMember(); break;
			case 3:
			case 0: System.out.println("종료합니다."); break;
			default : System.out.println("제대로 입력을..");break;
			}
			
		}while(input!=0);
	}

	public void createMember() {
	
		LinkedHashMap<String, Object> member = new LinkedHashMap<String, Object>();
		
		System.out.print("책번호 : ");
		int no = sc.nextInt();
		member.put("책번호", no);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		member.put("이름",name);
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		member.put("출판사",publisher);
		
		System.out.print("작가 : ");
		String writer = sc.nextLine();
		member.put("작가",writer);
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		member.put("가격", price);
		
		list.add(member);
		
		
		System.out.println("생성완료");
	}
	
	public void viewMember() {
		
		for(Map<String, Object> temp: list) {
			System.out.println(temp);
		}
		
	}
}
