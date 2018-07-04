package Day2;

import java.util.Scanner;

public class ForEx5 {
	public static void main(String[] args) {
		/* 정수가 소수인지 아닌지 판별하는 코드를 작성하세요
		 * 소수는 약수가 1과 자기자신뿐인 수
		 * 2, 3, 5, 7, 11, 13, 17...
		 * => 방법 1 : 약수가 2개
		 * => 방법 2 : 자기 자신을 빼고 처음으로 구한 약수가 1이면 소수
		 * 방법1
		 * 1. 정수를 저장할 변수 num의 약수의 갯수를 저장할 변수
		 *	  cnt와 반복문 변수 i를 선언 및 초기화
		 * 2. i는 1부터 num까지 하나씩 증가하면서 반복
		 * 3. i가 num의 약수이면 약수의 갯수 1개 증가
		 * 4. 반복문이 종료된 후 약수의 갯수가 2개이면 소수
		 * 	   아니면 합성수로 출력	  
		 * 방법2
		 * 2. i는 num-1부터 1까지 하나씩 감소하면서 반복
		 * */
		Scanner sc = new Scanner(System.in);
		
		
		int i = 0, j =0;
		int cnt = 0;
		
		System.out.print("100이하의 소수 : ");
		for(i = 1; i<=100; i++){
			cnt = 0;
			for(j = 1; j<=i; j++){
				if(i % j == 0){
					cnt++;
				}
			}
			if(cnt == 2){
				System.out.print(i+" ");
			}
		}
		
		//방법1
		System.out.println();
		System.out.println();
		System.out.print("소수인지 판별할 숫자를 입력하세요 :");
		int num = sc.nextInt();
		cnt = 0;
		for(i = 1; i <= num; i++){
			if(num % i == 0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println(num+"은(는) 소수 입니다.");
		}else{
			System.out.println(num+"은(는) 합성수 입니다.");
		}
		
		//방법2
		cnt=0;
		for(i = num-1; i >= 1; i--){
			if(num % i == 0){
				break;
			}
		}
		if(i == 1){
			System.out.println(num+"은(는) 소수 입니다.");
		}else{
			System.out.println(num+"은(는) 합성수 입니다.");
		}
	}
}
