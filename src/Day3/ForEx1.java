package Day3;

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
		
		 if���� �����
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
		
		
		 *     *		�߰��Ⱥ� : 0
 		 *    ** *		�߰��Ⱥ� : 1
		 *   *** **		�߰��Ⱥ� : 2
		 *  **** ***	�߰��Ⱥ� : 3
		 * ***** ****	�߰��Ⱥ� : 4
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
		
		
		 *     *		����:4, ��:1
 		 *    ***		����:3, ��:3
		 *   *****		����:2, ��:5
		 *  *******		����:1, ��:7
		 * *********	����:0, ��:9
		 *				����:5-i,��:2*i-1
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
		
		 ������ ��ü�� ����ϴ� �ڵ带 �ۼ��ϼ���. 
		int a = 0;
		for(int i=2;i<=9;i++){
			System.out.println(i+"��");
			for(int j=1;j<=9;j++){
				a=i*j;
				System.out.println(i+" x "+j+" = "+a);
			}
		}
		*/
		/* 2���� 100������ ��� �Ҽ��� ����ϼ���. */
		
		int num = 100;
		int cnt = 0;
		System.out.print(num+"������ �Ҽ�: ");
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

}
