package com.callor.classes.exec;

/*
 * Java의 class
 * 객체지향 프로그래밍 방법론적인 부분에서 가장 표준적인 코딩 스타일
 * Java는 모든 코드(파일)가 기본적으로 class로 부터 시작한다
 * Java의 소스코드는 *.java라는 이름으로 파일이 저장되지만 Java클래스 파일이라고 명명한다
 * method들이 포함되고 변수들이 포함된다
 * method만 있는 클래스파일이 있고, 변수들만 있는 클래스 파일이 있고, method와 변수가 함께있는 파일이 있다
 * 
 * 코드를 테스트하고 실행하기 위해 main() method를 작성한다 man() method를 진입점, 시작점 method 라고 하며,
 * main() method를 포함하는 java class 코드를 진입점 코드 라고 한다
 */
public class ExecA {

	public static void main(String[] args) {

		// 한개의 정수형 변수를 만들고 51~100까지 랜덤 수로 초기화 하기
		int num1 = (int) (Math.random() * 50) + 51;

		// 여러개의 정수형 변수 배열(묶음)을 선언하고
		// 10개를 생성하여 배열을 만든다
		int[] nums = new int[10];
		
		// 생선된 배열(공간)에 정수값을 저장하기
		// 배열에 값을 저장하기 위해서는 배열의 index를 지정
		// 배열[index]
		// 배열의 index는 항상 0부터 시작한다
		// 배열의 index 끝 값은 (배열의 길이) - 1
		nums[0] = 100; // nums 배열 0번 위치에 정수 100 저장
		nums[1] = 33;
		nums[2] = 55;
		nums[3] = 66;
		nums[4] = 77;
		nums[5] = 88;
		nums[6] = 99;
		nums[7] = 11;
		nums[8] = 22;
		nums[9] = 62;
		
		// nums 배열의 3번 index에 저장된 값을 읽어서
		// num1 변수에 저장하라
		num1 = nums[3];
		
		// nums 배열의 5번 index에 저장된 값을 읽어서 Console에 출력하라
		System.out.println(nums[5]);
	}

}
