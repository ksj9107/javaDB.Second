package Day4;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Ex1 {
	public static void main(String[] args) {
//		int num = 10;
		/* 서식문자
		 * %d : 정수형
		 * %f / %lf : 실수형
		 * %c : 문자형
		 * %s : 문자열
		 * */
//		System.out.printf("num : %d\n",num);
//		System.out.println("num : "+num);
//		if(num%2==2){
//			System.out.println();//if문의 중괄호가 없는경우 :
//								 //실행문이 두줄 이상 들어갈 경우 첫 실행문만 실행이됨
//		}
		/* 정수형 변수 num가 홀수이면 홀수입니다를 
		 * 짝수이면 짝수입니다를 출력하느 코드를 
//		 * 작성하세요.*/
//		if(num%2==0){
//			System.out.println("짝수입니다.");
//		}else{
//			System.out.println("홀수입니다.");
//		}
		
//		switch(num%2){
//		case 1 :
//			System.out.println("홀수입니다");
//			break;
//		case 0 :
//			System.out.println("짝수입니다");
//			break;
//		default :
//			System.out.println("종료합니다");
//			break;
//		int sum = 0;
//		for(int i = 1 ; i <= 10; i++){
//			System.out.print(i+" ");
//			sum+=i;
//		}
//		System.out.println();
//		System.out.println("sum : "+sum);
//		
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요*/
		/*int num1 = 0;
		int cnt = 0;
		int div = 1;*/
		/*for(int i=1;i<num1;i++){
			if(num1%i==0){
				cnt++;
			}
		}
		if(cnt==1)
			System.out.println(num1+"은 소수입니다.");
		else
			System.out.println(num1+"은 합성수입니다.");*/
	 /* 소수를 구하는 다른 방법
	  * 소수의 약수는 나를 제외한다면 %이다.
	  * 나를 제외한 약수중 가장 큰 수가 1.
	  */
		/*for(int i=num1-1;i>0;i--){
			if(num1%i==0){
				div = i;
				break;
			}
		}
		if(div==1){
			System.out.println(num1+"는 소수");
		}else{
			System.out.println(num1+"는 합성수");
		}*/
		/* 최대 공약수를 구하는 코드를 작성하세요 */
		/*int num1=121, num2=44;
		int gcd=0, min=0;
		if(num1<num2)
			min=num1;
		else
			min=num2;
		for(int i=min;i>=1;i--){
			if(num1%i==0&&num2%i==0){
				gcd=i;
				break;
			}
		}
		System.out.println(num1+" 과 "+num2+"의 최대공약수 :"+gcd);
		*/
		
		/* 최소 공배수를 구하는 코드를 작성해보세요. */
		/* 최소 공배수는 두 수의 배수중 가장 작은 수
		 * 두 수와 최소공배수를 저장할 변수를 만든다.(num1,num2,minct)
		 * 두 수 중에 작은수와 큰수를 판별해서 변수에 새로 저장한다.(min,max)
		 * 작은 값의 곱으로 반복문을 무한대로 돌린다
		 * 실행 중 큰 값의 곱이 맞는 값이 나오면 최소공배수에 저장한다.
		 * break를 건다.
		 * 최소공배수의 값을 출력한다.
		 * */
	  /*int num1=6,num2=8;
		int minct=0,min=0,max=0;
		if(num1<num2){
			min=num1;
			max=num2;
		}else{
			min=num2;
			max=num1;
		}
			
		for(int i=min;i>0;i+=min){
			if(i%max==0){
				minct=i;
				break;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최소공배수 : "+minct);*/
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		/* *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		for(int i=1;i<=num;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*     * : 공백 4 / 별 1
		 *    ** : 공백 3 / 별 2
		 *   *** : 공백 2 / 별 3
		 *  **** : 공백 1 / 별 4
		 * ***** : 공백 0 / 별 5
		 * */
		for(int i=1;i<=num;i++){
			for(int j=0; j<num-i;j++){
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++){
				System.out.print("*");
			}
				System.out.println();
		}
		
		/* *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 * */
		for(int i=num; i>0; i--){
			for(int j=i; j<num; j++){
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/* *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 * */
		for(int i=num; i>0; i--){
			for(int j=i; j<num; j++){
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*   * 1	공백의 갯수:2  별의갯수:1 
		 *  ** 2  	공백의 갯수:1  별의갯수:2
		 * *** 3 	공백의 갯수:0  별의갯수:3
		 *  ** 4 	공백의 갯수:1  별의갯수:2
		 *   * 5	공백의 갯수:2  별의갯수:1 
		 *   		Math.abs(3-i)  3-Math.abs(3-i)
		 * num=5  (num+1)/2
		 * */
/*		for(int i=1; i<=num; i++){
			for(int j=1; j<=(num+1)/2;j++){
				if(j <= Math.abs((num+1)/2-i)){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}*/
	}
}
