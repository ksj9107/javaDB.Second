package Day3;

import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		int i=1;//초기화
		while(i<=5){//조건식
			System.out.println("Hello world!");//실행문
			i++;//증감연산
		}
		//표준입력 방법
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("num = "+num);
		double num2 = scan.nextDouble();
		System.out.println("num2 = "+num2);
		char ch = scan.next().charAt(0);
		System.out.println("ch = "+ch);
		scan.close();*/
		Scanner scan = new Scanner(System.in);
		char mode = 'a';
		while(!(mode == 'q' || mode == 'Q')){
			System.out.print("프로그램을 종료하려면 'q'또는 'Q'를 눌러주세요");
			mode = scan.next().charAt(0);
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
}
