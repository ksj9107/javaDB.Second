package Day5;

import java.util.Scanner;

public class methodEx1 {
	/* 메소드 : 특정 기능을 하도록 모아놓은 코드
	 * 메소느는 입력(파라미터)과 출력(리턴타입)이 필요하다.
	 * 단, 상황에 따라서 입력과 출력이 필요없을 수도있다.
	 * 접근제한자(public) static 출력(void) 메소드이름(main)(매개변수들(String[] args){
	 * 		구현;
	 * }
	 * ex)
	 * 기능(메서드) : 자판기
	 * 입력(매개변수) : 돈, 선택메뉴
	 * 출력(리턴타입) : 선택된 음료수
	 * */
	public static void main(String[] args) {//메인은 콘솔에서 사용하기 위해 꼭 필요한 메소드
	/* 두 수와 연산자가 주어졌을 때 산술연산을 하는 코드를 작성하세요. */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2를 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.print("구하고자하는 연산을 입력하세요 : ");
		char op = sc.next().charAt(0);
		double result = 0.0;
		
		result = operate(num1,num2,op);
		System.out.printf("%d %s %d = %g \n",num1,op,num2,result);
		System.out.println(""+num1+ op+num2+" = "+result);
		sc.close();
	}
	public static double operate(int num1, int num2, char op){
		double res = 0.0;
		if(op == '+'){
			res = num1 + num2;
		}else if (op == '-') {
			res = num1-num2;
		}else if(op == '*') {
			res = num1 * num2;
		}else if(op == '/'){
			res = (double)num1 / num2;
		}else{
			System.out.println("연산자를 잘못 입력하셨습니다");
		}
		return res;
	}
}
