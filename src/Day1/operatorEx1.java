package Day1;

public class operatorEx1 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 3;
		double res = 0; // 정수 계산 = 실수자료형 값(O) / 실수 계산 = 정수자료형 값(X)
		//산술연산자 예제
		System.out.println("산술연산자 예제");
		res = num1 + num2;
		System.out.println("num1 + num2 = "+res);
		res = num1 - num2;
		System.out.println("num1 - num2 = "+res);
		res = num1 * num2;
		System.out.println("num1 * num2 = "+res);
		res = (double)num1 / num2;
		System.out.println("num1 / num2 = "+res);
		// 0으로 나누게 될경우 에러 발생
		// 정수형의 나누기의 결과값은 소수점을 버리고 출력된다.
		/* 명시적 자료형 변환 :
		 * (자료형)의 방법을 이용해서 임시적으로 해당 연산에서만 자료형을 변환할 수 있다.
		 * 자동 자료형 변환 :
		 * 정수형 계산의 결과값을 실수형으로 출력하는 경우 자료형이 실수형으로 변환되어 계산된다.
		 */
		res = num1 % num2;
		System.out.println("num1 % num2 = "+res);
		// %(mod연산자) 짝수 홀수 등의 판단을 할 경우 많이 사용한다.
		num1 = (int)res;
		//명시적 자료형 변환을 통해 정수형에 실수형의 데이터를 넣을 수 있다.(자동변환 불가)
		//자동 형 변환 : 작은 단위(바이트수)->큰 단위로 넘어갈때 & 정수 -> 실수
		
		//비교 연산자 예제 : 결과값으로 참 또는 거짓을 반환
		boolean isPositive = false; //초기화를 안할 시 에러발생확률 존재. 이를 제거하기 위해 초기화
		num1 = 20;
		//크거나 같다 : >= (o) => (x)
		//작거나 같다 : <= (o) =< (x)
		//같다 : == (o) =(x)
		isPositive = num1 >= 0;
		System.out.println("Is num1  bigger than 0? " + isPositive);
		boolean isSame = false;
		isSame = num1 == 10;
		System.out.println("num1 : "+num1+", 10과 같음 : "+ isSame);
		boolean isDifferent = false;
		isDifferent = num1 != 10;
		System.out.println("num1 : "+num1+", 10과 같지 않음 : "+ isDifferent);
		
		/* 논리 연산자 : 결과값이 true 또는 false
		 * 논리 연산자를 기준으로 좌, 우에 조건식이 들어가야함
		 * 조건식 : 참과 거짓으로 나뉘는 식
		 * (비교연산자 이용한 식) 논리연산자 (비교연산자를 이용한 식)
		 * 논리연산자 기호 : &&, ||, !
		 */
		num1 = 110;
		// 0 <= num1 <=100
		// num1이 0보다 크거나 같고, num1이 100보다 작거나 같다.
		// false
		// num1이 0보다 크거나 같거나, num1이 100보다 작거나 같다.
		// 0 <= num1  num1 <= 100
		// && 둘다 참일 때에만 참
		// || 둘다 거짓일 때에만 거짓
		// ! 참이면 거짓으로, 거짓은 참으로
		
		boolean isScore = false;
		isScore = num1 >= 0 && num1 <=100;
		System.out.println("Score Validity of "+num1+" : " +isScore);
		boolean isNot = false;
		System.out.println("!false : "+ !isNot);
		
		/* 비트 논리 연산자 : 두 변수를 비트로 나열한후
		 * 각 비트별로 논리 연산을 한다.
		 * 결과는 true 또는 false가 아닌 변수값이 나온다.
		 * 임베디드 프로그램에서 주로 사용한다.
		 * &(그리고), |(또는), ~(아니다), ^(베타)
		 */
		num1 = 7;
		num2 = 10;
		int num3 = 7 & 10;
		/*  7 : 00000000 00000000 00000000 00000111
		 * 10 : 00000000 00000000 00000000 00001010
		 * 	& : 00000000 00000000 00000000 00000010
		 */
		System.out.println("7&10 : " + num3);
		
		num3 = 7 | 10;
		/*  7 : 00000000 00000000 00000000 00000111
		 * 10 : 00000000 00000000 00000000 00001010
		 *  | : 00000000 00000000 00000000 00001111
		 */
		System.out.println("7|10 : " + num3);
		
		num3 = 7 ^ 10;
		/*	^ : 베타 논리 연산, exclusive or 연산, 서로 다른 경우에만 1
		 *  7 : 00000000 00000000 00000000 00000111
		 * 10 : 00000000 00000000 00000000 00001010
		 *  ^ : 00000000 00000000 00000000 00001101
		 */
		System.out.println("7^10 : " + num3);
		
		num3 = ~7;
		/*    7   : 00000000 00000000 00000000 00000111
		 * ~7(-8) : 11111111 11111111 11111111 11111000
		 * 		    - 							      1				
		 *        : 11111111 11111111 11111111 11110111
		 *        : 00000000 00000000 00000000 00001000
		 * -> 보수를 양수로 만들어 보며 음수의 값이 8이라는 것을 증명
		 */
		System.out.println("7~10 : " + num3);
		
		System.out.println(7+4);
		System.out.println(""+7+4);
		
		/* 비트 쉬프트 연산자 : 비트를 이동시킴
		 * >>, <<
		 */
		
		//     15     :00000000 00000000 00000000 00001111
		// 15 << 2(60):00000000 00000000 00000000 00111100
		// 15 << 1(30):00000000 00000000 00000000 00011110
		// <<(왼쪽 시프트) : a << n 은 a에 2의 n승을 곱한 결과가 출력
		// >>(오른쪽 시프트) : a >> n은 a를 2의 n승으로 나눈 결과가 출력 
		num1 = 15;
		num3 = num1 << 1;
		System.out.println("15 << 1 :" + num3);
		
		num1 = 15;
		num3 = num1 >> 1;
		System.out.println("15 << 1 :" + num3);
		
		//증감연산자 : ++, --
		//++ : 원래 값에서 1이 증가
		//-- : 원래 값에서 1이 감소
		//++변수명(전위형) , 변수명++(후위형)
		num1 = 10;
		num1++;
		System.out.println("계산후 후위형 num1++ : "+ num1);
		
		num1 = 10;
		++num1;
		System.out.println("계산후 전위형 ++num1 : "+ num1);
		
		num1 = 10;
		System.out.println("계산중 후위형 num1++ : "+ num1++);

		num1 = 10;
		System.out.println("계산중 전위형 ++num1 : "+ ++num1);
		/* 전위형 : 증가 후 동작(대입연산, 화면에 출력)
		 * 후위형 : 동작 후 증가
		 */
		
		/* 조건 선택 연산자(삼항연산자)
		 * 문법 : (조건식) ? (값1):(값2);
		 * 결과 : 조건식이 참이면 값1을, 거짓이면 값2를 반환
		 */
		System.out.println((10%2==0)?"짝수":"홀수");
	}

}
