package com.callor.classes;

import java.util.List;

public class ClassC {

	/*
	 * 변수의 접근 제한자
	 * public 으로 선언된 변수는 어디에서나 접근가능하다
	 * 하지만 private으로 선언된 변수는 현재 클래스의 method에서만 접근이 가능하다
	 * public 으로 선언된 변수는 예기치 않게 다른 곳에서 변수값이 변경될 수 있다
	 * 변수의 값을 보호하기 위해서는 변수를 private으로 선언하고 getter, setter method를 통해서 접근하도록 한다
	 * 
	 * protected 접근 제한자
	 * 현재 클래스(ClassC)를 상속받은 클래스에서만 public 처럼 자유롭게 접근이 가능하도록 하는 keyword
	 * 상속을 해주는 부모 클래스를 만들때 상속을 받는 자식 클래스에서 변수에 자유롭게 접근하도록 하는 키워드
	 */
	protected List<Integer> numList;
	
	public void printList() {
		/*
		 * println() 아 numList.toString() method를 실행하여 return 되는 문자열을 받고 Console에 출력하라
		 * .toStirng() 이 생략된 코드로 생각하면 된다
		 */
		System.out.println(numList);
	}
}
