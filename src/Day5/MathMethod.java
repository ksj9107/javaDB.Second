package Day5;

import java.util.Scanner;

public class MathMethod {
	static int gcd=0;
	/* main�޼ҵ忡 �ִ� num1,num2��
	 * gcd�޼ҵ忡 �ִ� num1,num2�� ���� �ٸ� �����̴�.
	 * */
	/* �޼ҵ带 ����ϴ� ����
	 * 1. �ڵ��� �ߺ��� �ּ�ȭ
	 * 2. �޼ҵ带 ����
	 * */
	public static void main(String[] args) {
		/* �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���. */
		Scanner sc = new Scanner(System.in);
		
		int num1=0,num2=0;
		int lcm=0;
		
		num1 = sc.nextInt();
		num2 =sc.nextInt();
		
		gcd = gcd(num1,num2);
		lcm = lcm(num1,num2);
		System.out.println(num1+"��(��)"+num2+"�� �ִ����� :"+ gcd);
		System.out.println(num1+"��(��)"+num2+"�� �ּҰ���� :"+ lcm);
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
}
