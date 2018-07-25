package Day5;

import java.util.Scanner;

public class MathMethod {
	
	/* main메소드에 있는 num1,num2와
	 * gcd메소드에 있는 num1,num2는 서로 다른 변수이다.
	 * */
	/* 메소드를 사용하는 이유
	 * 1. 코드의 중복을 최소화
	 * 2. 메소드를 재사용
	 * */
	public static void main(String[] args) {
		/* 최대 공약수를 구하는 코드를 작성하세요. */
		Scanner sc = new Scanner(System.in);
		
		int num1=0,num2=0;
		int lcm=0, gcd=0;
		
		num1 = sc.nextInt();
		num2 =sc.nextInt();
		
		gcd = gcd(num1,num2);
		lcm = lcm2(num1,num2);
		System.out.println(num1+"과(와)"+num2+"의 최대공약수 :"+ gcd);
		System.out.println(num1+"과(와)"+num2+"의 최소공배수 :"+ lcm);
		sc.close();
	}
	public static int gcd(int num1,int num2){
		int min=0, gcd=0;
		if(num1>num2)
			min = num2;
		else
			min = num1;
		
		for(int i=1;i<=min;i++){
			if(num2%i==0 && num1%i==0){
				gcd = i;
			}
		}
		return gcd;
	}
	public static int lcm(int num1,int num2){
		for(int i=num1;i<=num1*num2;i+=num1){
			if(i%num2==0){
				return i;
			}
		}
		return 1;
	}
	public static int lcm2(int num1,int num2){
		int lcm=0;
		lcm = num1*num2/gcd(num1,num2);
		return lcm;
	}
}
