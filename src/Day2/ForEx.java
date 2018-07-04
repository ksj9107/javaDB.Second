package Day2;

public class ForEx {
	public static void main(String[] args) {
		/* 반복문은 규칙성을 가지고 동일한 동작을 수행하도록
		 * 하는 문법
		 * for, while, do while 3가지
		 * for 또는 while문을 주로 사용하고, 
		 * do while은 잘 사용하지 않음
		 * 반복문에서 중요한것은 규칙성을 찾는게 중요하다.
		 * */
		/*
		for(변수초기화; 조건식 ; 증감연산){
			실행문;
		}
		변수초기화 : 반복문의 반복횟수를 위해 사용하는 변수의 초기값을 설정
		조건식 : 반복횟수를 결정하는 변수가 언제까지 반복할건지를
			   정해주는 조건식
		증감연산 : 반복회수를 경정하는 변수를 증가하거나 감소시킴
		for문 동작순서
		변수 초기화 > 조건식(참) > 실행문 > 증감연산 >
		 		   조건식(참) > 실행문 > 증감연산 >
		 		   조건식(거짓) > for문 종료
		*/
		int i = 0; //반복문을 반복시키기위한 변수
		for(i = 0 ; i < 5 ; i++){
			System.out.println("HelloWorld!");
		}
	}
}
