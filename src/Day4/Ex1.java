package Day4;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Ex1 {
	public static void main(String[] args) {
//		int num = 10;
		/* ���Ĺ���
		 * %d : ������
		 * %f / %lf : �Ǽ���
		 * %c : ������
		 * %s : ���ڿ�
		 * */
//		System.out.printf("num : %d\n",num);
//		System.out.println("num : "+num);
//		if(num%2==2){
//			System.out.println();//if���� �߰�ȣ�� ���°�� :
//								 //���๮�� ���� �̻� �� ��� ù ���๮�� �����̵�
//		}
		/* ������ ���� num�� Ȧ���̸� Ȧ���Դϴٸ� 
		 * ¦���̸� ¦���Դϴٸ� ����ϴ� �ڵ带 
//		 * �ۼ��ϼ���.*/
//		if(num%2==0){
//			System.out.println("¦���Դϴ�.");
//		}else{
//			System.out.println("Ȧ���Դϴ�.");
//		}
		
//		switch(num%2){
//		case 1 :
//			System.out.println("Ȧ���Դϴ�");
//			break;
//		case 0 :
//			System.out.println("¦���Դϴ�");
//			break;
//		default :
//			System.out.println("�����մϴ�");
//			break;
//		int sum = 0;
//		for(int i = 1 ; i <= 10; i++){
//			System.out.print(i+" ");
//			sum+=i;
//		}
//		System.out.println();
//		System.out.println("sum : "+sum);
//		
		/* ���� num�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���*/
		/*int num1 = 0;
		int cnt = 0;
		int div = 1;*/
		/*for(int i=1;i<num1;i++){
			if(num1%i==0){
				cnt++;
			}
		}
		if(cnt==1)
			System.out.println(num1+"�� �Ҽ��Դϴ�.");
		else
			System.out.println(num1+"�� �ռ����Դϴ�.");*/
	 /* �Ҽ��� ���ϴ� �ٸ� ���
	  * �Ҽ��� ����� ���� �����Ѵٸ� %�̴�.
	  * ���� ������ ����� ���� ū ���� 1.
	  */
		/*for(int i=num1-1;i>0;i--){
			if(num1%i==0){
				div = i;
				break;
			}
		}
		if(div==1){
			System.out.println(num1+"�� �Ҽ�");
		}else{
			System.out.println(num1+"�� �ռ���");
		}*/
		/* �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ��� */
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
		System.out.println(num1+" �� "+num2+"�� �ִ����� :"+gcd);
		*/
		
		/* �ּ� ������� ���ϴ� �ڵ带 �ۼ��غ�����. */
		/* �ּ� ������� �� ���� ����� ���� ���� ��
		 * �� ���� �ּҰ������ ������ ������ �����.(num1,num2,minct)
		 * �� �� �߿� �������� ū���� �Ǻ��ؼ� ������ ���� �����Ѵ�.(min,max)
		 * ���� ���� ������ �ݺ����� ���Ѵ�� ������
		 * ���� �� ū ���� ���� �´� ���� ������ �ּҰ������ �����Ѵ�.
		 * break�� �Ǵ�.
		 * �ּҰ������ ���� ����Ѵ�.
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
		System.out.println(num1+"�� "+num2+"�� �ּҰ���� : "+minct);*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
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
		
		/*     * : ���� 4 / �� 1
		 *    ** : ���� 3 / �� 2
		 *   *** : ���� 2 / �� 3
		 *  **** : ���� 1 / �� 4
		 * ***** : ���� 0 / �� 5
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
		
		/*   * 1	������ ����:2  ���ǰ���:1 
		 *  ** 2  	������ ����:1  ���ǰ���:2
		 * *** 3 	������ ����:0  ���ǰ���:3
		 *  ** 4 	������ ����:1  ���ǰ���:2
		 *   * 5	������ ����:2  ���ǰ���:1 
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
