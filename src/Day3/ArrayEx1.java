package Day3;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class ArrayEx1 {
	public static void main(String[] args) {
		/* 배열은 자료형이 같은 변수를 하나로 묶는 것으로,
		 * 동일한 목적의 변수이어야 한다.*/
		int num [] = new int[5];
		/* 1. 배열을 쓰면 반복문을 이용하기 편하다.
		 * 2. 배열의 값을 가져오기 위해서는 배열의 인덱스로
		 * 	   접근해 가야하는데 인덱스의 시작번지는 0번지이다.
		 * */
		for(int i=0;i<num.length; i++){
			num[i] = i+1;
		}
		for(int i=0;i<num.length; i++){
			System.out.println("num["+i+"] : "+num[i]);
		}
		int []num1,num3;
		//int[]이 공통으로 되어 num1, num3가 배열이됨
		int num2[],num4;
		//int가 공동으로 되어 num2는 배열, num4는 변수가됨
		num1 = new int[3];//나중에 할당할 수 있음(선언하고 바로 할당하지 않아도됨)
		
		/* num1 : 배열
		 * num2 : 배열
		 * num3 : 배열
		 * num4 : 변수
		 * */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if(size >= 0)
			num2 = new int[size];
		sc.close();
		
		int num5[] = {1,2,3,4,5};
		for(int i=0;i<num5.length; i++){
			num5[i] = i+1;
		}
		for(int i=0;i<num5.length; i++){
			System.out.println("num5["+i+"] : "+num5[i]);
		}
		int num6[];
		//num6[] = {1,2,3,4,5} : 초기화는 배열을 선언할 때에만 가능
	}
}
