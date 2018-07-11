package Day3;

import java.util.Scanner;

public class BreakCountinueEx {
	public static void main(String[] args) {
      /*System.out.println("break문 예제");
		for(int j = 1; j<=5; j++){	
			for(int i = 1; i<=5; i++){
				System.out.println("j="+j+"i="+i);
				if(i==4){
					break;
				}
			}
		}	
		System.out.println("continue문 예제");
		for(int j = 1; j<=5; j++){	
			for(int i = 1; i<=5; i++){
				if(i==4){
					continue;  skip과 같은 의미 
								: i가 4이면 아래의 실행문으로 가지말고 바로 위의 증감연산으로 넘어가라
								
				}
				System.out.println("j="+j+"i="+i);
			}
		}
		System.out.println("이름이 있는 for문 break문 예제");
		Test://for문의 이름을 줌
		for(int j = 1; j<=5; j++){	
			for(int i = 1; i<=5; i++){
				System.out.println("j="+j+"i="+i);
				if(i==4){
					break Test;//해당 이름의 for문 밖으로 빠져나감
				}
			}
		}	*/

		
		/* 1부터 100까지 짝수의 합을 continue문을 사용하여 작성하세요*/
		Scanner sc = new Scanner(System.in);
		System.out.print("합을 구할 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num1; i++){
			/*
			 * if(i%2==0)
			 * 		sum += i;
			 * */
			if(i%2==1){
				continue;	
			}
			sum += i;
		}
		System.out.println("1부터 "+num1+"까지 짝수의 합 : "+sum);
		sc.close();
	}
}
