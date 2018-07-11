package Day3;

import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String[] args) {
		/* 정수의 약수를 배열에 저장하는 코드를 작성하세요.
		 * 배열은 10개짜리로하고, 약수가 10개 이상인 수들은
		 * 10개까지만 구한다.
		 * */
//		int div[] = new int[10];
//		int num = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("약수를 구할 정수를 입력하세요 : ");
//		num = sc.nextInt();
//		int cnt = 0;
//		for(int i=1;i<=num;i++){
//			if(num%i==0){
//				div[cnt]=i;
//				cnt++;
//				
//			}
//		}
//		System.out.print(num+"의 약수 :");
//		for(int i=0; i<cnt; i++){
//			System.out.print(div[i]+" ");
//		}
//		sc.close();
		
		int div2[] = new int[10];
		int i = 0;
		int num2 = 12;
		int cnt = 0;//약수의 갯수를 저장하는 변수
		i = 1;
		while(i<=num2){
			if(num2 % i==0){
				System.out.print(i+" ");
				div2[cnt]=i;//약수 i를 배열 div에 저장하는데
				cnt++;//위치는 현재까지 찾은 약수의 갯수번지에 저장
				//그리고 저장한 후에는 약수의 갯수를 하나
				//증가한다.
				if(cnt==9){
					break;
				}
			}
			i++;
		}
	}
}
