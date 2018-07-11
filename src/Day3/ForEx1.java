package Day3;

import java.io.InputStream;
import java.util.Scanner;

public class ForEx1 {
	public static void main(String[] args) {
		/*		
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		 if문을 사용한
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		for(int i=1; i<=5; i++){
			for(int j=1;j<=5;j++){
				if(j<=i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****    
		 
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5;j++){
				if(j>=i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=5-i)
				 System.out.print(" ");
				else
				System.out.print("*");
			}

			System.out.println();
		}
		
		
		 *     *		추가된별 : 0
 		 *    ** *		추가된별 : 1
		 *   *** **		추가된별 : 2
		 *  **** ***	추가된별 : 3
		 * ***** ****	추가된별 : 4
		 * 
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5;j++){
				if(j>=i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			
			}
			for(int j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=5-i)
				 System.out.print(" ");
				else
				System.out.print("*");
			}
			for(int j=1;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		 *     *		공백:4, 별:1
 		 *    ***		공백:3, 별:3
		 *   *****		공백:2, 별:5
		 *  *******		공백:1, 별:7
		 * *********	공백:0, 별:9
		 *				공백:5-i,별:2*i-1
		 * 
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		 * *********	
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 * 

		for(int i = 1 ; i <= 5 ; i++ ){
			for(int j = 1; j <= i-1; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=2*5+1-2*i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++){
			for(int j=1;j<=2*5-i;j++){
				if(j <= i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--){
			for(int j=1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		 구구단 전체를 출력하는 코드를 작성하세요. 
		int a = 0;
		for(int i=2;i<=9;i++){
			System.out.println(i+"단");
			for(int j=1;j<=9;j++){
				a=i*j;
				System.out.println(i+" x "+j+" = "+a);
			}
		}
		*/
		/* 2부터 100이하의 모든 소수를 출력하세요. */
		
		int num = 100;
		int cnt = 0;
		System.out.print(num+"이하의 소수: ");
		for(int i=2;i<=num;i++){
			cnt = 0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					cnt++;
			}
			if(cnt == 2)
				System.out.print(i+" ");
		}
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
}
