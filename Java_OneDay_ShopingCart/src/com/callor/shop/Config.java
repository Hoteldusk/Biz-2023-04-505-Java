package com.callor.shop;

public class Config {

	public static final void shoppingTitle() {
		System.out.println("=".repeat(120));
		System.out.println("빛나라 쇼핑몰 2023");
		System.out.println("=".repeat(120));
		System.out.println("상품관리");
		System.out.println("-".repeat(60));
		System.out.println("\t1. 상품리스트");
		System.out.println("\t2. 상품등록 및 수정");
		System.out.println("-".repeat(60));
		System.out.println("고객관리");
		System.out.println("-".repeat(60));
		System.out.println("\t3. 고객리스트");
		System.out.println("\t4. 고객등록 및 수정");
		System.out.println("-".repeat(60));
		System.out.println("상품판매");
		System.out.println("-".repeat(60));
		System.out.println("\t5. 장바구니 상품 담기");
		System.out.println("\t6. 구매자별 장바구니 리스트 보기");
		System.out.println("\t7. 장바구니 전체 리스트 보기");
		System.out.println("-".repeat(60));
		System.out.println("QUIT. 끝내기");
		System.out.println("=".repeat(120));
		System.out.print("선택 >> ");
	}
}
