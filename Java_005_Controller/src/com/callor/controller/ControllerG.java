package com.callor.controller;

public class ControllerG {

	/*
	 * prime() method 의 코드를 수정하여 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경 void type의 prime()
	 * method를 boolean type의 prime() method로 변경
	 * 
	 * 
	 * method를 선언할때 void type 이외의 type으로 선언하면 method {} 내에서 반드시 return 명령문이 있어야 한다
	 * prime() method {} 내에서 선언했던 rndNum 변수를 매개변수(parameter)로 변경하였다. 매개변수는 스스로 초기화할수
	 * 없다 누군가 prime() method를 호출 하면서 값을 전달해주어야만 그 값으로 초기화 할수 있다 prime(int rndNum =
	 * 0)과 같은 코드 사용 불가
	 * 
	 * main() 에서 prime(55) 와 같은 코드가 실행 될때 매개변수 값이 초기화 된다
	 * 
	 */
	public static boolean prime(int rndNum) {
//		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;

		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
//				break;
				return false;
			}
		}

//		if (isPrime) {
//			System.err.println(rndNum + "\t소수");
//		} else {
//			System.out.println(rndNum + "\t\t소수 아님");
//		}
		boolean yesPrime = rndNum <= index;

		return yesPrime;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// main에서 랜덤수를 만들고
			int mainRndNum = (int) (Math.random() * 50) + 51;

			// prime() method에게 "전달해주기"
			// prime() method에게 mainRndNum 변수에 저장된 값을 "전달해 주기"
			// 이때 mainRndNum 를 argument 라고 한다
			if (prime(mainRndNum)) {
				System.err.println(mainRndNum + "소수");
			} else {
				System.out.println(mainRndNum + "소수 아님");
			}
		}

	}
}
